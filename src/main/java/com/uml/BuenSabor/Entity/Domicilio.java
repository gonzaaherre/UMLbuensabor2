package com.uml.BuenSabor.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Domicilio extends Base{
    private String calle;

    private Integer numero;

    private Integer cp;

    @ManyToOne(cascade = CascadeType.ALL)
    private Localidad localidad;
}
