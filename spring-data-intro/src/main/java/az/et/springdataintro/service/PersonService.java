package az.et.springdataintro.service;

import az.et.springdataintro.dao.entity.PersonEntity;
import az.et.springdataintro.dao.repository.PersonRepository;
import az.et.springdataintro.exception.PersonAlreadyExistsException;
import az.et.springdataintro.exception.PersonNotFoundException;
import az.et.springdataintro.mapper.CommonMapper;
import az.et.springdataintro.model.dto.PersonDto;
import az.et.springdataintro.util.ValidatorUtil;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public List<PersonDto> getAllPersons() {
        return personRepository.findAll()
                .stream()
                .map(CommonMapper::toDto)
                .collect(Collectors.toList());

    }

    public PersonDto getPersonById(Long id) {
        return personRepository.findById(id)
                .map(CommonMapper::toDto)
                .orElseThrow(() -> new PersonNotFoundException("Person with id: [" + id + "] not found!"));
    }

    public PersonDto createPerson(PersonDto personDto) {
        ValidatorUtil.requireNullId(personDto.getId());
        personRepository.findByEmail(personDto.getEmail()).ifPresent(personEntity -> {
            throw new PersonAlreadyExistsException("Person with email: [" + personEntity.getEmail() + "] not found!");
        });
        PersonEntity savedPersonEntity = personRepository.save(CommonMapper.toEntity(personDto));
        return CommonMapper.toDto(savedPersonEntity);
    }

    public PersonDto updatePerson(PersonDto personDto) {
        final Long id = personDto.getId();
        ValidatorUtil.requireNotNullId(id);

        PersonEntity personEntity = personRepository.findById(id)
                .orElseThrow(() -> new PersonNotFoundException("Person with id: [" + id + "] not found!"));
        personEntity.setName(personDto.getName());
        personEntity.setEmail(personDto.getEmail());
        personEntity.setAge(personDto.getAge());
        personEntity.setBudget(personDto.getBudget());

        PersonEntity updatedPerson = personRepository.save(personEntity);
        return CommonMapper.toDto(updatedPerson);
    }
}
