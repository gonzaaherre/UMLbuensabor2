package com.uml.BuenSabor.Entity;

import com.uml.BuenSabor.Enum.Estado;
import com.uml.BuenSabor.Enum.FormaPago;
import com.uml.BuenSabor.Enum.TipoEnvio;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class PedidoVenta extends Base{

    private BigDecimal HoraEstimadaFinalizacion ;

    private BigDecimal subTotal;

    private BigDecimal descuento;

    private BigDecimal gastosEnvio;

    private BigDecimal total;

    private BigDecimal totalCosto;

    @Enumerated(EnumType.STRING)
    private Estado estado;

    @Enumerated(EnumType.STRING)
    private TipoEnvio tipoEnvio;

    @Enumerated(EnumType.STRING)
    private FormaPago formaPago;

    private Date fechaPago;

    @ManyToOne
    private Empleado empleado;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private FacturaVenta facturaVenta;

    @OneToMany(mappedBy = "pedidoVenta", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PedidoVentaDetalle> detalles;

    @ManyToMany
    @JoinTable(
            name = "pedido_venta_sucursal_empresa",
            joinColumns = @JoinColumn(name = "pedido_venta_id"),
            inverseJoinColumns = @JoinColumn(name = "sucursal_empresa_id")
    )
    private List<SucursalEmpresa> sucursalesEmpresa;

}

