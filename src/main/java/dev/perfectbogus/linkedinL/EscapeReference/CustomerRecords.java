package dev.perfectbogus.linkedinL.EscapeReference;

import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecords implements Iterable<Customer>{

    private Map<String, Customer> records;

    public CustomerRecords(){
        this.records = new HashMap<>();
    }

    public void addCustomer(Customer c){
        this.records.put(c.getName(), c);
    }

    public Map<String, Customer> getCustomer(){
        return Collections.unmodifiableMap(this.records);
    }

    public CustomerReadOnly getCustomerByName(String name){
        return new Customer(this.records.get(name));
    }

    @NotNull
    @Override
    public Iterator<Customer> iterator() {
        return records.values().iterator();
    }
}
