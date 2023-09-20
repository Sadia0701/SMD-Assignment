import java.util.ArrayList;
import java.util.List;

// Abstract Person class
abstract class Person {
    private int aadharId;
    private String name;
    private String address;
    private int phone;
    private String profession;
    private String uid;

    public Person(int aadharId, String name, String address, int phone, String profession, String uid) {
        this.aadharId = aadharId;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.profession = profession;
        this.uid = uid;
    }

    public abstract String performDuty();

    public abstract String includeService();

    public abstract String likeItem();
}

// Polymorphic class Student
class Student extends Person {
    private String studentId;
    private String major;
    private int year;
    private int semester;
    private String college;
    private int grade;
    private String course;
    private List<String> learn;

    public Student(int aadharId, String name, String address, int phone, String profession, String uid,
                   String studentId, String major, int year, int semester, String college, int grade) {
        super(aadharId, name, address, phone, profession, uid);
        this.studentId = studentId;
        this.major = major;
        this.year = year;
        this.semester = semester;
        this.college = college;
        this.grade = grade;
        this.course = "";
        this.learn = new ArrayList<>();
    }

    public void registerCourse(String course) {
        this.course = course;
        System.out.println("The following course has been registered:" + course);
    }

    public int getGrade(String course) {
        System.out.println("The grade for the course: " + course + "is:" + this.grade);
        return 0;
    }

    public String attendClass(String className) {
        return "Attending class: " + className;
    }

    public void learn(String subject) {
        learn.add(subject);
    }

    @Override
    public String performDuty() {
        return "Student are performing their duty";
    }

    @Override
    public String includeService() {
        return "Student are including their services";
    }

    @Override
    public String likeItem() {
        return "Student do like some items";
    }
}

// Polymorphic class Staff
class Staff extends Person {
    private String empId;
    private String empRole;
    private String empDept;
    private float empSalary;
    private int empExperience;
    private String duty;

    public Staff(int aadharId, String name, String address, int phone, String profession, String uid,
                 String empId, String empRole, String empDept, float empSalary, int empExperience) {
        super(aadharId, name, address, phone, profession, uid);
        this.empId = empId;
        this.empRole = empRole;
        this.empDept = empDept;
        this.empSalary = empSalary;
        this.empExperience = empExperience;
        this.duty = "";
    }

    public String attendDuty(String duty) {
        this.duty = duty;
        return " Staff attending their duty: " + duty;
    }

    public String getPromotion() {
        if (empExperience >= 5) {
            return "Promotion received";
        } else {
            return "Not eligible for promotion";
        }
    }

    public int getSalary() {
        return (int) empSalary;
    }

    @Override
    public String performDuty() {
        return "Staff is performing their duty";
    }

    @Override
    public String includeService() {
        return "Staff is including their services";
    }

    @Override
    public String likeItem() {
        return "Staff do like some items";
    }
}

// Concrete class PGStudent
class PGStudent extends Student {
    private String rollNo;
    private String specialization;
    private boolean thesisSubmitted;

    public PGStudent(int aadharId, String name, String address, int phone, String profession, String uid,
                     String studentId, String major, int year, int semester, String college, int grade,
                     String rollNo, String specialization) {
        super(aadharId, name, address, phone, profession, uid, studentId, major, year, semester, college, grade);
        this.rollNo = rollNo;
        this.specialization = specialization;
        this.thesisSubmitted = false;
    }

    public void submitThesis() {
        this.thesisSubmitted = true;
    }
}

// Concrete class Faculty
class Faculty extends Staff {
    private String facultySpecialization;
    private String section;
    private int numberOfStudents;
    private String qualification;

    public Faculty(int aadharId, String name, String address, int phone, String profession, String uid,
                   String empId, String empRole, String empDept, float empSalary, int empExperience,
                   String facultySpecialization, String section, int numberOfStudents, String qualification) {
        super(aadharId, name, address, phone, profession, uid, empId, empRole, empDept, empSalary, empExperience);
        this.facultySpecialization = facultySpecialization;
        this.section = section;
        this.numberOfStudents = numberOfStudents;
        this.qualification = qualification;
    }

    public String teachCourse(String course) {
        return course;
    }

    public String assessStudentGrade() {
        return "Assessing student grade";
    }
}

// Concrete class Technician
class Technician extends Staff {
    private String techType;

    public Technician(int aadharId, String name, String address, int phone, String profession, String uid,
                      String empId, String empRole, String empDept, float empSalary, int empExperience,
                      String techType) {
        super(aadharId, name, address, phone, profession, uid, empId, empRole, empDept, empSalary, empExperience);
        this.techType = techType;
    }

    public String maintainLab(String lab) {
        return "Maintaining " + lab;
    }

    public String installSystem(String system) {
        return "Installing " + system;
    }
}

public class Q1 {
    public static void main(String[] args) {

        Student student = new Student(32154, "Ali", "B2. hs#213 Mailaad St", 0300-1234567, "Student", "UID2374",
                "S2374", "Computer Science", 4, 8, "FAST Nuces", 130);

        student.registerCourse("Software for Mobile Devices");
        student.learn("Java Programming");
        System.out.println(student.performDuty());

        Faculty faculty = new Faculty(45321, "Hammaad", "B1,hs#371 Faisal Town", 0313-7654321, "Faculty", "UID1234",
                "F5678", "Professor", "Computer Science", 120000, 5,
                "Computer Science", "7A", 50, "Masters in CS");

        faculty.teachCourse("Software for Mobile Devices");
        System.out.println(faculty.getPromotion());
    }
}