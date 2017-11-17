import java.util.Comparator;

public class ComperX implements Comparator <Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.findMax(o1.grades) > o2.findMax(o2.grades)) return -1;
        else if (o1.findMax(o1.grades) < o2.findMax(o2.grades)) return 1;
        else return 0;
    }
}
