package dev.perfectbogus.linkedinL.EscapeReference;

public class Main {

    public static void main(String[] args) {
        CustomerRecords records = new CustomerRecords();

        records.addCustomer(new Customer("John"));
        records.addCustomer(new Customer("Simon"));

        for(Customer next: records){
            System.out.println(next);
        }

        records.getCustomer().clear();
        for(Customer next: records.getCustomer().values()){
            System.out.println(next);
        }
    }
}
