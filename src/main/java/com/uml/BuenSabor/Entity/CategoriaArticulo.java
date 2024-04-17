package com.uml.BuenSabor.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
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
public class CategoriaArticulo extends Base{
    private String denominacion;

    @OneToMany(mappedBy = "categoriaArticulo")
    private List<ArticuloInsumo> articulosInsumo;

    @OneToOne
    @JoinColumn(name = "categoria_padre_id")
    private CategoriaArticulo categoriaPadre;

    @OneToOne(mappedBy = "categoriaPadre")
    private CategoriaArticulo categoriaHija;


}
