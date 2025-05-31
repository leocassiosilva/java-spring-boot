package br.com.erudio.mapper.custom;

import java.util.Date;

import org.springframework.stereotype.Service;

import br.com.erudio.data.dto.v2.PersonDTOV2;
import br.com.erudio.model.Person;


@Service
public class PersonMapper {
    public PersonDTOV2 convertEntitytoDTO(Person person) {
        PersonDTOV2 dto = new PersonDTOV2();
        dto.setId(person.getId());
        dto.setFirstName(person.getFirstName());
        dto.setLastName(person.getLastName());
        dto.setBirthDay(new Date());
        dto.setAddress(person.getAddress());
        dto.setGender(person.getGender());
    
        
        return dto;
    }

    public Person convertDTOtoEntity(PersonDTOV2 person) {
        Person entity = new Person();
        
        entity.setId(person.getId());
        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        // entity.setBirthDay(new Date());
        entity.setAddress(person.getAddress());
        entity.setGender(person.getGender());
    
        
        return entity;
    }

}
