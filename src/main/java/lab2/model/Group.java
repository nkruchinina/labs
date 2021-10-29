package lab2.model;

import java.util.List;
import java.util.Objects;

public class Group extends EducationalUnit {
    private List<Human> students;

    public List<Human> getStudents() {
        return students;
    }

    public void setStudents(List<Human> students) {
        this.students = students;
    }

    @Override
    public String toString(){
        String s;
        s = "Title of group is " + title;
        s = s + ". Its group leader`s name is " + manager;
        s = s + ". The list of the students from the group is following:" + students + "\n";
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(students, group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(students);
    }
}