package lab2.view;

import lab2.controllers.UniversityCreator;
import lab2.model.University;

public class Run {
    public static void main (String[] args){
        UniversityCreator universityCreator=new UniversityCreator();
        University university = universityCreator.createUniversityRandomly();
        System.out.println(university.toString());
    }
}
