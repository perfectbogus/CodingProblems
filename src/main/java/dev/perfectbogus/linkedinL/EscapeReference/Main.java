package dev.perfectbogus.linkedinL.EscapeReference;

public class Main {

    public static void main(String[] args) {
        CustomerRecords records = new CustomerRecords();

        records.addCustomer(new Customer("John"));
        records.addCustomer(new Customer("Simon"));

        for(Customer next: records){
            System.out.println(next);
        }

        //this no longer available due to was avoid the escaping reference of the collection
        // using unmodifyable map
        //records.getCustomer().clear();
        for(Customer next: records.getCustomer().values()){
            System.out.println(next);
        }

        Customer anotherCustomer = records.getCustomerByName("John");
        System.out.println(anotherCustomer.getName());
    }
}
