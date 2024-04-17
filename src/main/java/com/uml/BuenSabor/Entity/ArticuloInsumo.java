package com.uml.BuenSabor.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ArticuloInsumo extends Base{
    private String denominacion;
    private double precioCompra;
    private double precioventa;
    private boolean esParaElaborar;

    @OneToMany(mappedBy = "articuloInsumo")
    private List<PedidoVentaDetalle> detallesPedidoVenta;

    @OneToMany(mappedBy = "articuloInsumo")
    private List<FacturaVentaDetalle> facturaVentaDetalles;

    @OneToOne(cascade = CascadeType.ALL)
    private ArticuloManufacturadoDetalle articuloManufacturadoDetalle;

    @OneToOne(cascade = CascadeType.ALL)
    private PromocionDetalle promocionDetalle;

    @OneToMany(mappedBy = "articuloInsumo")
    private List<Sucursal_Insumo> sucursalInsumos;

    @ManyToOne
    @JoinColumn(name = "categoria_articulo_id")
    private CategoriaArticulo categoriaArticulo;

    @OneToOne(cascade = CascadeType.ALL)
    private ImagenInsumo imagen;

    @OneToOne(cascade = CascadeType.ALL)
    private UnidadDemedida unidadMedida;

}
