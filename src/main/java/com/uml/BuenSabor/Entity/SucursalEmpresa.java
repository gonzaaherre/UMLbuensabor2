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
public class SucursalEmpresa extends Base{
    private String nombre;

    private String horarioApertura;

    private String horarioCierre;

    @ManyToOne(cascade = CascadeType.ALL)
    private Empresa empresa;

    @OneToOne(cascade = CascadeType.ALL)
    private Domicilio domicilio;

    @ManyToMany(mappedBy = "sucursalesEmpresa")
    private List<PedidoVenta> pedidosVentas;

    @ManyToMany(mappedBy = "sucursalesEmpresa")
    private List<Sucursal_Insumo> sucursalesInsumo;

}
