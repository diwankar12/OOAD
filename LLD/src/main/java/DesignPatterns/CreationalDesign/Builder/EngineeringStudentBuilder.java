package DesignPatterns.CreationalDesign.Builder;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder {
    @Override
    public StudentBuilder setSubjects() {
        List<String> ls = new ArrayList<>();
        ls.add("ATD ") ;
        ls.add("BTD ") ;
        ls.add(" Data Structure") ;
        this.subjects = ls ;
        return this ;
    }
}
