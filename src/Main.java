import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws DuplikatExcepation {
        WykazS ws = new WykazS();
        try {
            ws.addStudent(199200, "Kazik");
            ws.addStudent(199201, "Kazik");
            ws.addStudent(199204, "Nikodem");
            ws.addStudent(199205, "Jan");
            ws.addStudent(189557, "Wiesiek");
            ws.addStudent(199200, "Marcin");
        }
        catch(DuplikatExcepation m){
            m.printStackTrace();
        }
        ws.addGrade(199200, 5);
        ws.addGrade(199200, 4);
        ws.addGrade(199200, 3);
        ws.addGrade(199200, 5);
        ws.addGrade(199200, 2);

        ws.addGrade(199201, 5);
        ws.addGrade(199201, 6);

        ws.addGrade(199204, 4);
        ws.addGrade(199204, 5);


        ws.addGrade(199205, 3);

        ws.addGrade(189557, 4);

        ws.printRemove(2);
    }
}
