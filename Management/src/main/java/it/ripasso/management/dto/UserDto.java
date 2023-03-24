package it.ripasso.management.dto;

import it.ripasso.management.model.Area;
import it.ripasso.management.model.Device;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String name;

    private String surname;

    private String badge;

    private String email;


    private LocalDate bDay;

    private boolean activeFlag;

    private long id_area;
}
