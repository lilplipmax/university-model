package org.example.src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private String name;
    private String group;
    private int course;
    //Реализован список оценок по каждому предмету
    //В целом в этот список может хранить и 1 значение, алгоритм подсчета среднего балла от этого не ломается
    private Map<String, List<Integer>> marks;

    public Student(String name, String group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
        marks = new HashMap<>();
    }
    public void addMark(String objectName, Integer mark){
        if(marks.get(objectName)==null){
            List<Integer> marksForCurrentObject = new ArrayList<>();
            marksForCurrentObject.add(mark);
            marks.put(objectName, marksForCurrentObject);
        }
        else marks.get(objectName).add(mark);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Map<String, List<Integer>> getMarks() {
        return marks;
    }

    public void setMarks(Map<String, List<Integer>> marks) {
        this.marks = marks;
    }
}
