package Java17.Inheritance.Challenge;

public class Main {

    public static void main(String[] args) {

        Employee tim = new Employee("Tim","11/11/1985","01/01/2020") ;
        System.out.println(tim);
        System.out.println("Age "+tim.getAge());
        System.out.println("Pay = "+tim.collectPay());

        Employee tim2 = new Employee("Tim","11/11/1985","01/01/2020") ;
        System.out.println(tim2);
        System.out.println("Age "+tim2.getAge());
        System.out.println("Pay = "+tim2.collectPay());

    }
}
