package com.cupidbot;

public class CupidBotService {

    public String getReply(String message) {

        message = message.toLowerCase();

        // Ghosting
        if (message.contains("ghost")) {
            return "I'm sorry you're going through that. Getting ghosted hurts, but it usually says more about the other person's communication than your worth. Send at most one follow-up message, then focus on yourself instead of chasing. What's been the hardest part for you?";
        }

        // Breakup
        if (message.contains("breakup") || message.contains("broke up")) {
            return "Breakups can be incredibly painful, and it's okay to feel upset. Give yourself time to heal, lean on friends or family, and avoid making impulsive decisions. What's been the most difficult part since the breakup?";
        }

        // First Date
        if (message.contains("first date")) {
            return "It's completely normal to be nervous before a first date. Focus on being curious, ask open-ended questions, and be yourself rather than trying to impress. What are you most nervous about?";
        }

        // Asking Someone Out
        if (message.contains("crush") || message.contains("ask her") || message.contains("ask him")) {
            return "Feeling nervous is normal. Keep it simple and respectful: invite them for coffee or a walk, and accept whatever answer they give gracefully. Do you already know them well?";
        }

        // Texting
        if (message.contains("text")) {
            return "Try to keep your texts genuine and avoid overthinking every message. Match their level of effort, ask questions naturally, and don't feel pressured to reply instantly. What happened in your conversation?";
        }

        // Confidence
        if (message.contains("confidence") || message.contains("shy")) {
            return "Confidence grows through action, not perfection. Set one small goal, like starting a short conversation today, and remember that everyone feels awkward sometimes. What situations make you feel the most nervous?";
        }

        // Red Flags
        if (message.contains("red flag")) {
            return "Some common red flags are dishonesty, disrespect, controlling behavior, and ignoring boundaries. Healthy relationships are built on trust and mutual respect. What behavior are you concerned about?";
        }

        // Green Flags
        if (message.contains("green flag")) {
            return "Green flags include honest communication, kindness, consistency, respecting boundaries, and supporting each other's growth. Have you noticed any of these in the person you're dating?";
        }

        // Default Reply
        return "Thanks for sharing that with me. Tell me a little more about your situation so I can give advice that's specific to you. What's been happening?";
    }
}
