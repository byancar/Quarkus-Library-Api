package org.library.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Customer extends PanacheEntity {
    private String name;
    private String email;
    private String mobile;

    @OneToOne
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private CustomerAddress address;
}
