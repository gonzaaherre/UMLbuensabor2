package com.uml.BuenSabor.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ImagenManufacturado extends  Base{
    private String denominacion;
    @ManyToOne
    private ArticuloManufacturado articuloManufacturado;
}
