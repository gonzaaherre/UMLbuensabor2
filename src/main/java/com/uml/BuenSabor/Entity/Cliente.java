package com.uml.BuenSabor.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Cliente extends Base{
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    private Domicilio domicilio;

    @OneToOne
    private Usuario usuario;

    @OneToMany(mappedBy = "cliente")
    private List<PedidoVenta> pedidosVentas;

}
