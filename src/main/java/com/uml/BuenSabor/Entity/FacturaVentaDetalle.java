package com.uml.BuenSabor.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class FacturaVentaDetalle extends  Base{
    private int cantidad;
    private BigDecimal SubTotal;

    @OneToOne
    @JoinColumn(name = "factura_venta_id")
    private FacturaVenta facturaVenta;

    @ManyToOne
    @JoinColumn(name = "articulo_manufacturado_id")
    private ArticuloManufacturado articuloManufacturado;

    @ManyToOne(cascade = CascadeType.ALL)
    private ArticuloInsumo articuloInsumo;
}
