package lab2.controllers;

import lab2.model.Human;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HumanCreator {
    public static final List<String> DICTIONARY_NAMES = Arrays.asList("Linda", "John", "Ivan", "Lionel", "Esperanza", "Rosalie",
            "Ciara", "Jimmy", "Timothy", "Anton");
    public static final List<String> DICTIONARY_SURNAMES = Arrays.asList("Schneider", "Delarosa", "Rynearson", "Harris", "Moore",
            "Sherwood", "Castle", "Kee", "Thompson", "Jensen");
    public static final List<String> DICTIONARY_DATE_OF_BIRTH = Arrays.asList("28-11-1999", "18-10-2000", "11-04-1996",
            "06-02-1997", "17-06-1996", "25-10-2001", "17-09-2001", "19-06-1997", "01-06-1996", "13-03-1997");

    public Human createHumanRandomly(){
        Random random = new Random();
        Human human = new Human();
        human.setName(DICTIONARY_NAMES.get(random.nextInt(DICTIONARY_NAMES.size()-1)));
        human.setSurname(DICTIONARY_SURNAMES.get(random.nextInt(DICTIONARY_SURNAMES.size()-1)));
        human.setDateOfBirth(DICTIONARY_DATE_OF_BIRTH.get(random.nextInt(DICTIONARY_DATE_OF_BIRTH.size()-1)));
        return human;
    }
}
