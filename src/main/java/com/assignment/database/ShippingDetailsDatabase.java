package com.assignment.database;

import com.assignment.model.ShippingDetails;
import org.springframework.data.repository.CrudRepository;

public interface ShippingDetailsDatabase extends CrudRepository<ShippingDetails, String> {
}
