package Java17.Inheritance.Challenge;

import java.util.Date;

public class Worker {

    private String name ;
    private String birthDate ;
    private String endDate ;

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge(){
        int currentYear = 2025 ;
        return  currentYear - Integer.parseInt(birthDate.substring(6));
    }

    public double collectPay(){
         return 0.0;
    }

    public void terminate(String endDate){
             this.endDate = endDate ;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
