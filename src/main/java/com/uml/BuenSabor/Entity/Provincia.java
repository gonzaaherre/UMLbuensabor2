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
public class Provincia extends Base{

    private String provincia;

    @ManyToOne(cascade = CascadeType.ALL)
    private Pais pais;
}