package com.uml.BuenSabor.Entity;

import com.uml.BuenSabor.Enum.FormaPago;
import com.uml.BuenSabor.Enum.Rol;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class FacturaVenta extends Base{
    private Date fechaFacturacion;
    private int numeroFacturacion;
    @Enumerated(EnumType.STRING) // Especificamos que el atributo será almacenado como un String en la base de datos
    private FormaPago formaPago ;
    private BigDecimal subtotal;
    private BigDecimal descuento;
    private BigDecimal gastosEnvio;
    private BigDecimal totalVenta;

    @OneToMany(mappedBy = "facturaVenta")
    private List<PedidoVenta> pedidosVentas;

    @OneToOne
    private DatosMercadoPago datosMercadoPago;

    @OneToOne(mappedBy = "facturaVenta", cascade = CascadeType.ALL, orphanRemoval = true)
    private FacturaVentaDetalle detalle;


}
