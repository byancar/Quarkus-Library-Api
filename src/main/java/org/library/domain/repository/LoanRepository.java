package org.library.domain.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.library.domain.model.Loan;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LoanRepository implements PanacheRepository<Loan> {
}
