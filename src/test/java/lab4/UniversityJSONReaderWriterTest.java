package lab4;

import lab2.controllers.UniversityCreator;
import lab2.model.University;

import static org.junit.jupiter.api.Assertions.*;

class UniversityJSONReaderWriterTest {

    @org.junit.jupiter.api.Test
    void writeToFile() {
        UniversityJSONReaderWriter universityJSONReaderWriter = new UniversityJSONReaderWriter();
        UniversityCreator universityCreator=new UniversityCreator();
        University university = universityCreator.createUniversityRandomly();
        universityJSONReaderWriter.writeToFile(university, "./src/main/resources/lab4FileForText.json");
        University universityFromFile = universityJSONReaderWriter.readFromFile("./src/main/resources/lab4FileForText.json");

        assertEquals(universityFromFile, university);
    }
}

