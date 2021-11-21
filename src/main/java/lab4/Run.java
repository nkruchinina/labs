package lab4;

import lab2.controllers.UniversityCreator;
import lab2.model.University;

public class Run {
    public static void main (String[] args) {
        UniversityJSONReaderWriter universityJSONReaderWriter = new UniversityJSONReaderWriter();
        UniversityCreator universityCreator=new UniversityCreator();
        University initialUniversity = universityCreator.createUniversityRandomly();
        universityJSONReaderWriter.writeToFile(initialUniversity, "./src/main/resources/lab4FileForText.txt");
        University universityFromFile = universityJSONReaderWriter.readFromFile("./src/main/resources/lab4FileForText.txt");
    }
}
