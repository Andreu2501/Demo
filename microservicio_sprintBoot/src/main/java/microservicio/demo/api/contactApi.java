/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package microservicio.demo.api;

/**
 *
 * @author Antonio
 */
import microservicio.demo.dto.contact;
import microservicio.demo.service.contactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class contactApi {
    @Autowired
    contactService contactService;
    
    @RequestMapping(value="/addContact",method = RequestMethod.POST)
    public contact aupdateOrSave(@RequestBody contact contact){
        return contactService.save(contact);
    }
    
    @RequestMapping(value="/contact",method = RequestMethod.GET)
    public contact getById(){
        return new contact(1L, "John","wick","+57 311 222 3344", "john@gmail.com");
    }
}
