const chatBox = document.getElementById("chatBox");
const userInput = document.getElementById("userInput");

function addMessage(text, sender) {
    const message = document.createElement("div");
    message.className = sender === "user" ? "user-message" : "bot-message";
    message.innerHTML = text;
    chatBox.appendChild(message);
    chatBox.scrollTop = chatBox.scrollHeight;
}

async function sendMessage() {
    const text = userInput.value.trim();

    if (text === "") return;

    addMessage(text, "user");
    userInput.value = "";

    // Typing indicator
    const typing = document.createElement("div");
    typing.className = "bot-message";
    typing.id = "typing";
    typing.innerHTML = "❤️ CupidBot is typing...";
    chatBox.appendChild(typing);
    chatBox.scrollTop = chatBox.scrollHeight;

    try {
        const response = await fetch("http://localhost:8080/chat", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify({
                message: text
            })
        });

        const data = await response.json();

        document.getElementById("typing").remove();

        addMessage(data.reply, "bot");

    } catch (error) {
        document.getElementById("typing").remove();

        addMessage(
            "❌ Unable to connect to CupidBot server. Make sure the Java backend is running.",
            "bot"
        );

        console.error(error);
    }
}
