package com.crm.component;

import com.crm.models.Contact;
import com.crm.repository.ContactRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoLogger implements CommandLineRunner {

    public final ContactRepository repository;

    public DemoLogger(ContactRepository contactRepository){
        this.repository = contactRepository;
    }

    @Override
    public void run(String... args) throws Exception {
    /*   this.repository.save(new Contact("Ankit","Lalwani", "123456789", "ankitlalwani30@gmail.com"));
        this.repository.save(new Contact("Ankit1","Lalwani1", "111111111", "ankitlalwani.inbox@gmail.com"));

        this.repository.save(new Contact("anubha","adwani", "999999999", "anubhaad27@gmail.com"));
*/    }
}
