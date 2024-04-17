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
public class Sucursal_Insumo extends Base{
    private int stockActual;
    private int stockMinimo;
    private int stockMaximo;

    @ManyToOne
    @JoinColumn(name = "articulo_insumo_id")
    private ArticuloInsumo articuloInsumo;

    @ManyToMany
    @JoinTable(
            name = "sucursal_insumo_sucursal_empresa",
            joinColumns = @JoinColumn(name = "sucursal_insumo_id"),
            inverseJoinColumns = @JoinColumn(name = "sucursal_empresa_id")
    )
    private List<SucursalEmpresa> sucursalesEmpresa;
}
