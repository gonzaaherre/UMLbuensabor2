package com.uml.BuenSabor.Entity;

import com.uml.BuenSabor.Enum.FormaPago;
import jakarta.persistence.Entity;
import lombok.*;

import java.util.Date;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class DatosMercadoPago extends Base{
    private Date date_create;
    private Date date_approved;
    private Date date_last_update;
    private FormaPago formaPago;
    private String Status;
    private String status_detail;
}
