package com.assignment.database;

import com.assignment.model.PurchaseOrder;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseOrderDatabase extends CrudRepository<PurchaseOrder, String> {
}
