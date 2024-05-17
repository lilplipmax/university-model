package org.example.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class University {
    private List<Student> students;
    public void conductAnnualCertification(){
        List<Student> expelled = new ArrayList<>();
        for(Student st : students){
            if(getGPA(st.getMarks())<3) expelled.add(st);
            else st.setCourse(st.getCourse()+1);
        }
        students.removeAll(expelled);
    }
    public static double getGPA(Map<?, ? extends List<? extends Number>> map){
        double sum = 0;
        int count = 0;
        for(List<? extends Number> list : map.values()){
            for(Number number : list){
                sum+=number.doubleValue();
                count++;
            }
        }
        return sum/count;
    }
    public void printStudents(List<Student> students, int course){
        students.stream().filter(x -> x.getCourse() == course).forEach(x -> System.out.println(x.getName()));
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
