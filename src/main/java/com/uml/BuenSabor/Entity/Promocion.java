package com.uml.BuenSabor.Entity;

import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Promocion extends Base{
    private String denominacion;
    private LocalDate FechaDesde;
    private LocalDate FechaHasta;
    private double Descuento;


}
