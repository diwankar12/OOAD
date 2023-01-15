package DesignPatterns.CreationalDesign.Builder;

import java.util.ArrayList;
import java.util.List;

public class MbaStudentBuilder extends StudentBuilder {

    @Override
    public StudentBuilder setSubjects() {
        List<String> ls = new ArrayList<>();
        ls.add("Economics ") ;
        ls.add("Bussiness") ;
        ls.add("Operations Management") ;
        this.subjects = ls ;
        return this ;

    }
}
