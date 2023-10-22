package DesignPatterns.BehavioralPattern.Iterator;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        NameRepository repository = new NameRepository();
        Iterator it = repository.getIterator();
        while(it.hasNext()){
              String name = (String) it.next();
              System.out.println(name);
        }
     // using java way :

        List<String> names = Arrays.asList("cluso","sheeba","Jasmine");
        Stack<String> stack = new Stack<>();
        stack.push("10");
        stack.push("20") ;
       // java.util.Iterator iterator = stack.iterator();
        java.util.Iterator iterator = names.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

    }
}
