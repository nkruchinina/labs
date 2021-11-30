package lab2.controllers;
import lab2.model.Group;
import lab2.model.Human;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.List;

class GroupCreatorTest {

    @Test
    void createGroupRandomly() {
        float result = 0;
        int count = 1000;
        for (int iter = 0; iter < count; iter++){
            GroupCreator creator = new GroupCreator();
            Group group = creator.createGroupRandomly();
            List<Human> students = group.getStudents();
            HashSet<Human> humanSet = new HashSet<>();

            for (int i=0; i < students.size(); i++){
                humanSet.add(students.get(i));
            }

            if (students.size() != humanSet.size()){
                result++;
            }
        }
        System.out.println("Probability of duplicating of the personal data of people in one group: " + result / count * 100 + "%");
    }
}
