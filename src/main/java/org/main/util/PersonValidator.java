package org.main.util;

import org.main.dao.PersonDAO;
import org.main.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Optional;

@Component
public class PersonValidator implements Validator {

    private final PersonDAO personDAO;

    @Autowired
    public PersonValidator(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return Person.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Person person = (Person) o;

        Optional<Person> personInBase = personDAO.show(person.getName());

        if(personInBase.isPresent()) {
            if (personInBase.get().getId() != person.getId())
                errors.rejectValue("name", "", "A person with that name already exists");
        }
    }
}
