package com.assignment;

import com.assignment.database.CustomerDatabase;
import com.assignment.model.Customer;
import com.assignment.model.PurchaseOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assignment")
public class ControllerClass {

    @Autowired
    CustomerDatabase customerDatabase;

    @GetMapping("/haelthCheck")
    public boolean healthCheck(){
        return true;
    }

    @PostMapping("/addcustomer")
    public void addCustomer(@RequestBody Customer customer){
        customerDatabase.save(customer);
        System.out.println(customer.toString());
    }

    @PostMapping("/purchaseorder")
    public void purchaseOrder(@RequestBody PurchaseOrder purchaseOrder){
        System.out.println(purchaseOrder.toString());
    }

    @GetMapping("/getCustomers")
    public List<Customer> getCustomers(@RequestParam String city){
        System.out.print(city);
        return null;
    }


}
