import java.util.Comparator;

public interface Human {

    String getName();

    int getAge();
}
class SortByAge implements Comparator<Human> {

    // Used for sorting in ascending order of
    // roll number
    public int compare(Human a, Human b) {
        return a.getAge() - b.getAge();
    }
}