package org.library.domain.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.library.domain.model.Customer;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CustomerRepository implements PanacheRepository<Customer> {
}
