package Java17.Inheritance;

public class Dog extends Animal{
    private String earShape ;
    private String tailShape ;


    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type,  weight<15?"small":(weight<35?"medium":"large"),weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public Dog() {
        super("Mutt","Big",50);
    }

    public Dog(String type,double weight){
        this(type,weight,"Perky","Curled");
    }

    public void makeNoise(){}

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
}
