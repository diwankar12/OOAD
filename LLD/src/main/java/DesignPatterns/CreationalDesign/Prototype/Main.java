package DesignPatterns.CreationalDesign.Prototype;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square(10,15);
        square.draw();
        Shape cloneObj = square.cloneObject();
        cloneObj.draw();
    }
}
