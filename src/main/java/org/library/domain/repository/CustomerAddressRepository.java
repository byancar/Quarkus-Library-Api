package org.library.domain.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.library.domain.model.CustomerAddress;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CustomerAddressRepository implements PanacheRepository<CustomerAddress> {
}
