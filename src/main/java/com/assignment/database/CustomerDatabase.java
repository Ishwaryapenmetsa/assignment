package com.assignment.database;

import com.assignment.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerDatabase extends CrudRepository<Customer, Long> {

}
