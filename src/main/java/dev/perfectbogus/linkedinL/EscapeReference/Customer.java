package dev.perfectbogus.linkedinL.EscapeReference;

public class Customer {

    private String name;

    public Customer(String name){
        this.name = name;
    }

    public Customer(Customer oldCustomer){
        this.name = oldCustomer.name;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return this.name;
    }
}
