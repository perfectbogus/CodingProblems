package dev.perfectbogus.linkedinL;

public class PassingObjects {

    /**
     * in this case we need to remember that Java uses a Stack to store the reference to the objects
     * so, when you pass the list you get the value of the reference of the object for that reason
     * is modified the name of the customer
     *
     * Remember you are passing the value of the reference to the Heap memory allocated on the principal Stack
     *
     * @param args
     */
    public static void main(String[] args) {
        Customer c = new Customer("Bogus");
        renameCustomer(c);
        System.out.println(c.getName());
    }

    public static void renameCustomer(Customer customer){
        customer.setName("Perfectbogus");
    }

    static class Customer{

        private String name;

        public Customer(String name){
            this.name = name;
        }

        public void setName(String name){
            this.name = name;
        }

        public String getName(){
            return this.name;
        }
    }
}
