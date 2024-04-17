package com.uml.BuenSabor.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ArticuloManufacturado extends Base{
    private String denominacion;
    private String descripcion;
    private double precioVenta;
    private double precioCosto;
    private Integer tiempoEstimado;

    @OneToMany(mappedBy = "articuloManufacturado")
    private List<FacturaVentaDetalle> detallesFacturaVenta;

    @OneToMany(mappedBy = "articuloManufacturado")
    private List<PedidoVentaDetalle> detallesPedidoVenta;

    @OneToMany(mappedBy = "articuloManufacturado")
    private List<PromocionDetalle> detallesPromocion;


    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER,
            mappedBy = "articuloManufacturado"
    )
    private List<ArticuloManufacturadoDetalle> detalles = new ArrayList<>();
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER,
            mappedBy = "articuloManufacturado"
    )
    private List<ImagenManufacturado> imagenes = new ArrayList<>();

    @OneToOne(mappedBy = "articuloManufacturado")
    private CategoriaArticulomanufacturado categoria;
}
