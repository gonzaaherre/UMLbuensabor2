package com.uml.BuenSabor.Entity;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ImagenInsumo extends Base {
    private String denominacion;
}