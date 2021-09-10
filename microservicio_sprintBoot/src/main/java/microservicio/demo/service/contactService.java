/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package microservicio.demo.service;

import microservicio.demo.dao.contactRepository;
import microservicio.demo.dto.contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Antonio
 */
@Service
public class contactService {
    @Autowired
    contactRepository dao;
     public contact save(contact contact){
        return dao.saveAndFlush(contact);
    }
}
