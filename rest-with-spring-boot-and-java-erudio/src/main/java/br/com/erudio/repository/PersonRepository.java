package br.com.erudio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.erudio.model.Person;

public interface PersonRepository extends JpaRepository <Person, Long> {
    // Custom query methods can be defined here if needed
    // For example, you can add methods to find persons by name or other attributes

}
