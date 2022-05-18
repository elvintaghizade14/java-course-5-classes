package az.et.springdataintro.dao.repository;

import az.et.springdataintro.model.dto.PersonDto;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class PersonRepositoryInMemory {

    private static final List<PersonDto> PERSON_DTOS = new ArrayList<>(Arrays.asList(
            new PersonDto(1L, "Elvin", "elvin@gmail.com", 23, BigDecimal.TEN),
            new PersonDto(2L, "Zohrab", "zohrab@gmail.com", 30, BigDecimal.ZERO)));

    public List<PersonDto> findAll() {
        return PERSON_DTOS;
    }


    public Optional<PersonDto> findById(Long id) {
        return PERSON_DTOS.stream().filter(personDto -> personDto.getId() == id).findFirst();
    }

    public Optional<PersonDto> findByEmail(String email) {
        return PERSON_DTOS.stream().filter(personDto -> personDto.getEmail().equals(email)).findFirst();
    }

    public PersonDto save(PersonDto person) {
        Long newId = PERSON_DTOS.stream().map(PersonDto::getId).max(Long::compareTo).orElse(100L) + 1;
        person.setId(newId);
        PERSON_DTOS.add(person);
        return person;
    }
}
