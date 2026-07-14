package com.cupidbot;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class ChatController {

    private final CupidBotService service = new CupidBotService();

    @PostMapping("/chat")
    public ChatResponse chat(@RequestBody ChatRequest request) {

        String reply = service.getReply(request.getMessage());

        return new ChatResponse(reply);
    }

}
