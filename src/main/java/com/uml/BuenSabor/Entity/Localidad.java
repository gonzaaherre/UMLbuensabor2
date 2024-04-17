package com.uml.BuenSabor.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Localidad extends Base{
    private String nombre;

    @ManyToOne(cascade = CascadeType.ALL)
    private Provincia provincia;

}
