/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package microservicio.demo.dao;

/**
 *
 * @author Antonio
 */
import org.springframework.data.jpa.repository.JpaRepository;
import microservicio.demo.dto.contact;
public interface contactRepository extends JpaRepository<contact, Long>  {
    
}
