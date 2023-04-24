package Java17.Constructor;

public class Customer {

    private String name ;
    private double creditLimit ;
    private String emailAddress ;

    public Customer() {
        this("John",500,"j@email.com");
    }

    public Customer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public Customer(int creditLimit, String emailAddress) {
        this("pal",creditLimit,emailAddress);
//        this.creditLimit = creditLimit;
//        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
