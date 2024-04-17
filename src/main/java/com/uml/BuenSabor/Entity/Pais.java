package com.uml.BuenSabor.Entity;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Pais extends Base{
    private String nombre;


}
