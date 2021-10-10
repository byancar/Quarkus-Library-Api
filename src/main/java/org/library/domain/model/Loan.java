package org.library.domain.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Audited
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table
@Data
public class Loan extends PanacheEntity {

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "id")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

    @CreationTimestamp
    @Column(name = "loan_date")
    private LocalDateTime loanDate;

    @Column(name = "loan_return_date")
    private LocalDateTime loanReturnDate;


}
