package com.uml.BuenSabor.Entity;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Usuario extends Base{
    private String auth0Id;

    private String username;
}
