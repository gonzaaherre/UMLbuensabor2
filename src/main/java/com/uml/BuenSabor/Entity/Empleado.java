package com.uml.BuenSabor.Entity;

import com.uml.BuenSabor.Enum.Rol;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Empleado extends Base{

    private String nombre;

    private String apellido;

    private String telefono;

    private String email;

    @Enumerated(EnumType.STRING) // Especificamos que el atributo será almacenado como un String en la base de datos
    private Rol rol;

    @OneToOne
    private Usuario usuario;

    @OneToMany(mappedBy = "empleado")
    private List<PedidoVenta> pedidosVentas;


}
