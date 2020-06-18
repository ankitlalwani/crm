package com.crm.controllers;

import com.crm.models.Contact;
import com.crm.repository.ContactRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class ContactController {

    private ContactRepository  repository;

    public ContactController(ContactRepository repository){
        this.repository=repository;
    }

    @GetMapping("/contacts")
    public Collection<Contact> contacts(){
        return (Collection<Contact>) repository.findAll();
    }

    @PostMapping("/contacts")
    public ResponseEntity<Contact> createContact(@RequestBody Contact contact){
        Contact result = repository.save(contact);
        return ResponseEntity.ok().body(result);
    }
}
