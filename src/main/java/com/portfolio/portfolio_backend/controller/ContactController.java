package com.portfolio.portfolio_backend.controller;


import com.portfolio.portfolio_backend.entity.Message;
import com.portfolio.portfolio_backend.repository.MessageRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/contact")
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