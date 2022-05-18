package az.et.springdataintro.mapper;

import az.et.springdataintro.dao.entity.PersonEntity;
import az.et.springdataintro.model.dto.PersonDto;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class CommonMapper {

    public static PersonDto toDto(PersonEntity personEntity) {
        return PersonDto.builder()
                .id(personEntity.getId())
                .name(personEntity.getName())
                .email(personEntity.getEmail())
                .age(personEntity.getAge())
                .budget(personEntity.getBudget())
                .build();
    }

    public static PersonEntity toEntity(PersonDto personDto) {
        return PersonEntity.builder()
                .name(personDto.getName())
                .email(personDto.getEmail())
                .age(personDto.getAge())
                .budget(personDto.getBudget())
                .build();
    }
}
