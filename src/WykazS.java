import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class WykazS {

    ArrayList<Student> wykaz = new ArrayList<>();

    void addStudent(int nr , String name) throws DuplikatExcepation{
        for (Student s : wykaz){
            if(s.getIndex() == nr)
                throw new DuplikatExcepation("duplikat");
        }
        wykaz.add(new Student(nr, name));


    }

    int getNumber(int nr){
        for(int i=0 ; i<wykaz.size() ; i++)
            if(nr == wykaz.get(i).getIndex())
                return i;
            return 0;

    }

    void addGrade(int nr , int grade){
        int i = getNumber(nr);
        wykaz.get(i).grades.add(grade);
    }

    void print(int nr){
        int i = getNumber(nr);
        System.out.println(wykaz.get(i));
    }

    void print(){
        for(Student s : wykaz)
            System.out.println(s);
    }

    void sortujA(){
        Collections.sort(wykaz);
    }

    void sortujI(){
        Collections.sort(wykaz , new ComperX());
    }
    void printRemove(int grade) {
        for (Iterator<Student> i = wykaz.iterator(); i.hasNext(); ) {
            Student s = i.next();
            int min = s.findMin(s.grades);
            if(min < grade) i.remove();
        }
        print();
    }


}
