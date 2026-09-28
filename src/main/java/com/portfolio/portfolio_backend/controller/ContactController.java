package com.portfolio.portfolio_backend.controller;


import com.portfolio.portfolio_backend.entity.Message;
import com.portfolio.portfolio_backend.repository.MessageRepository;

import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/contact")
@CrossOrigin(
        origins = "https://portfolio-frontend-five-gray.vercel.app"
)
public class ContactController {


    private final MessageRepository messageRepository;


    public ContactController(MessageRepository messageRepository) {

        this.messageRepository = messageRepository;

    }



    @PostMapping
    public Message sendMessage(@RequestBody Message message) {

        return messageRepository.save(message);

    }


}