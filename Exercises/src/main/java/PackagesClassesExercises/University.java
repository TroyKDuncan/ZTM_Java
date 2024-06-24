package PackagesClassesExercises;

class Course {
    public int courseId;
    public String courseName;
}

class Enrollment {
    public Student student;
    public Course course;
}

class Student {
    public int studentId;
    public String name;
}

public class University {
    public static void main(String[] args) {
        Student Troy = new Student();
        Course ea1 = new Course();
        Enrollment enrollment = new Enrollment();

        Troy.name = "Troy";
        Troy.studentId = 123456;

        ea1.courseId = 789;
        ea1.courseName = "Engineering Analysis 1";

        enrollment.course = ea1;
        enrollment.student = Troy;

        System.out.println("Student name: " + enrollment.student.name);
        System.out.println("Student ID: " + enrollment.student.studentId + "\n");

        System.out.println("Course name: " + enrollment.course.courseName);
        System.out.println("Course ID: " + enrollment.course.courseId + "\n");

        System.out.println(enrollment.student.name + " is enrolled in " + enrollment.course.courseName);
    }
}