package DesignPatterns.CreationalDesign.Builder;

public class Director {


    StudentBuilder studentBuilder ;
    Director(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder ;
    }

    public Student createStudent(){

        if(studentBuilder instanceof EngineeringStudentBuilder){
             return createEngineeringStudent() ;
        }else if(studentBuilder instanceof MbaStudentBuilder){
            return createMbaStudent();
        }
        return null ;
    }

    private Student createMbaStudent() {
        return studentBuilder.setRollNumber(2).setAge(24).setName("sj")
                .setFatherName("fatherName").setMotherName("MotherName").setSubjects().build();
    }

    private Student createEngineeringStudent() {
        return studentBuilder.setRollNumber(1).setAge(22).setName("sj")
                .setSubjects().build();
    }


}
