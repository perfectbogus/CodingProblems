package dev.perfectbogus.linkedinL.EscapeReference;

public class Customer implements CustomerReadOnly {

    private String name;

    public Customer(String name){
        this.name = name;
    }

    public Customer(Customer oldCustomer){
        this.name = oldCustomer.name;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return this.name;
    }
}
