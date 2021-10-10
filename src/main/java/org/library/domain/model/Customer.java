package org.library.domain.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Audited
@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends PanacheEntity {
    private String name;
    private String email;
    private String mobile;

    @OneToOne
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private CustomerAddress address;
}
