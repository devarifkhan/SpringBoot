package com.devarifkhan.simplewebapplication.service;

import com.devarifkhan.simplewebapplication.model.Contact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    private static final Logger log = LoggerFactory.getLogger(ContactService.class);

    public boolean saveMessageDetails(Contact contact){
        boolean isSaved = false;

        log.info(contact.toString());
        return isSaved;
    }
}
