import java.util.ArrayList;

public class Student implements Comparable<Student> {
    private String name;
    private int index;
    ArrayList<Integer> grades = new ArrayList<>();

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", index=" + index + ", grades=["
                +grades+"]}"+
                '}';
    }

    public Student(int index , String name) {
        this.name = name;
        this.index = index;
    }

    @Override
    public int compareTo(Student o) {
        int compareName = name.compareTo(o.getName());
        if(compareName!=0) {
            return compareName;
        }
        return name.compareTo(o.getName());
    }

    int findMax(ArrayList<Integer> grades){
        int max = grades.get(0);
        for(int i=1 ; i<grades.size() ; i++){
            if(grades.get(i) > max){
                max = grades.get(i);
            }
        }
        return max;
    }

    int findMin(ArrayList<Integer> grades){
        int min = grades.get(0);
        for(int i=1 ; i<grades.size() ; i++){
            if(grades.get(i) < min){
                min = grades.get(i);
            }
        }
        return min;
    }
}
