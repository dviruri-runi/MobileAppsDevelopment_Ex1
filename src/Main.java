import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ICustomer> customers = new ArrayList<>();
        customers.add(new GoldCustomer(1,"Gold Customer 1"));
        customers.add(new SilverCustomer(2,"Silver Customer 2"));
        customers.add(new Customer(3,"Customer 3"));
        customers.add(new Customer(4,"Customer 4"));
        customers.add(new SilverCustomer(5,"Silver Customer 5"));
        customers.add(new Customer(6,"Customer 6"));
        customers.add(new Customer(7,"Customer 7"));
        customers.add(new SilverCustomer(8,"SilverCustomer 8"));
        customers.add(new Customer(9,"Customer 9"));
        customers.add(new GoldCustomer(10,"Gold Customer 10"));

        for (ICustomer customer : customers) {
            System.out.println(customer.getCustomerName() + " for 300 product pays " + customer.getPriceForProduct(300) + " for 3800 product pays " + customer.getPriceForProduct(3800));
        }

    }
}