import org.joda.time.DateTime;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        Student s1 = new Student("Stephen", 23, 1, DateTime.parse("2000-07-09T00:00:00.000Z"));
        Student s2 = new Student("Sean", 21, 2, DateTime.parse("2001-06-10T00:00:00.000Z"));
        Student s3 = new Student("Gerard", 20, 3, DateTime.parse("2000-09-05T00:00:00.000Z"));
        Student s4 = new Student("Martin", 22, 4, DateTime.parse("2000-07-08T00:00:00.000Z"));
        Student s5 = new Student("Niall", 17, 5, DateTime.parse("2001-05-04T00:00:00.000Z"));
        Student s6 = new Student("Evan", 19, 6, DateTime.parse("2000-01-05T00:00:00.000Z"));

        Programme p1 = new Programme("Computer Engineering", DateTime.parse("2022-05-01T00:00:00.000Z"), DateTime.parse("2023-05-01T00:00:00.000Z"));
        Programme p2 = new Programme("Mechanical Engineering", DateTime.parse("2022-05-01T00:00:00.000Z"), DateTime.parse("2023-05-01T00:00:00.000Z"));
        Programme p3 = new Programme("Electrical Engineering", DateTime.parse("2022-05-01T00:00:00.000Z"), DateTime.parse("2023-05-01T00:00:00.000Z"));

        Lecturer l1 = new Lecturer("Mike", 43, 1,DateTime.parse("2000-01-01T00:00:00.000Z"));
        Lecturer l2 = new Lecturer("Luke", 50, 2,DateTime.parse("1999-01-01T00:00:00.000Z"));
        Lecturer l3 = new Lecturer("Larry", 56, 3,DateTime.parse("1993-01-01T00:00:00.000Z"));
        Lecturer l4 = new Lecturer("Jack", 60, 4,DateTime.parse("19984-01-01T00:00:00.000Z"));

        Modules m1= new Modules("Software Engineering", "CT112");
        Modules m2= new Modules("Real time systems", "CT113");
        Modules m3= new Modules("CAD drawing", "BE114");
        Modules m4= new Modules("Thermodynamics" , "TY115");
        Modules m5= new Modules("Power Systems", "BE116");
        Modules m6= new Modules("Analogue systems" , "BE117");

        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(s1);
        studentsList.add(s2);
        studentsList.add(s3);
        studentsList.add(s4);
        studentsList.add(s5);
        studentsList.add(s6);

        ArrayList<Programme> courses= new ArrayList<Programme>();
        courses.add(p1);
        courses.add(p2);
        courses.add(p3);

        ArrayList<Modules> ceModules= new ArrayList<Modules>();
        ceModules.add(m1);
        ceModules.add(m2);

        ArrayList<Modules> elecModules= new ArrayList<Modules>();
        elecModules.add(m5);
        elecModules.add(m6);

        ArrayList<Modules> mechModules= new ArrayList<Modules>();
        mechModules.add(m3);
        mechModules.add(m4);

        s1.setModuleList(ceModules);
        s2.setModuleList(mechModules);
        s3.setModuleList(elecModules);
        s4.setModuleList(ceModules);
        s5.setModuleList(mechModules);
        s6.setModuleList(elecModules);

        ArrayList<Student> sListA= new ArrayList<Student>();
        sListA.add(s1);
        sListA.add(s4);

        ArrayList<Student> sListB= new ArrayList<Student>();
        sListB.add(s2);
        sListB.add(s5);

        ArrayList<Student> sListC= new ArrayList<Student>();
        sListB.add(s3);
        sListB.add(s6);

        p1.setModuleList(ceModules);
        p2.setModuleList(elecModules);
        p3.setModuleList(mechModules);

        p1.setStudentList(sListA);
        p2.setStudentList(sListB);
        p3.setStudentList(sListC);

        s1.setCourses(p1);
        s2.setCourses(p2);
        s3.setCourses(p3);
        s4.setCourses(p1);
        s5.setCourses(p2);
        s6.setCourses(p3);

        m1.setStudentList(sListA);
        m2.setStudentList(sListB);
        m3.setStudentList(sListC);
        m4.setStudentList(sListA);
        m5.setStudentList(sListB);
        m6.setStudentList(sListC);

        for(Programme p: courses){
            System.out.println("\nCourse Name:" + p.getCourseName() );
            System.out.println("Modules: ");
            for (Modules m: p.getModuleList()){
                System.out.println(" = "+m.getModName());
            }
        }

        System.out.println("\n\n\n");

        for(Student s : studentsList){
            System.out.println("\nStudent Name: " +s.getSName());
            System.out.println("UserName: "+s.getSUserName());
            System.out.println("Modules: ");

            for(Modules mod : s.getModuleList()){
                System.out.println(" =" +mod.getModName());
            }
            System.out.println("Courses: "+ s.getCourse().getCourseName());
        }


    }


}
