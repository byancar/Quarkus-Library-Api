package org.library.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.library.model.enumerator.StateEnum;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class CustomerAddress extends PanacheEntity {
    private String postalCode;
    private String address;
    private String number;
    private String city;
    private StateEnum state;
    private String country ="BR";
}
