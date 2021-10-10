package org.library.domain.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;
import org.library.domain.model.enumerator.StateEnum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import static org.hibernate.envers.RelationTargetAuditMode.NOT_AUDITED;

@Audited(targetAuditMode = NOT_AUDITED)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customer_address")
public class CustomerAddress extends PanacheEntity {
    @Column(name = "postal_code")
    private String postalCode;
    private String address;
    private String number;
    private String city;
    private StateEnum state;
    private String country = "BR";
}
