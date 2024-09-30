// Implement the class Teacher based on the class diagram and description given below.
// Method Description

// Teacher(String teacherName, String subject, double salary)

// Initialize the values of all the instance variables appropriately with the values passed

// Create a Tester class. Create 4 objects of Teacher class. Create an array of type Teacher store the created objects and display the details of the teachers.

class Teacher {
    private String teacherName;
    private String subject;
    private double salary;

    public Teacher(String teacherName, String subject, double salary) {
        this.teacherName = teacherName;
        this.subject = subject;
        this.salary = salary;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "Name: " + teacherName + ", Subject: " + subject + ", Salary: " + salary;
    }
}

public class Tester {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Alice", "Mathematics", 50000);
        Teacher teacher2 = new Teacher("Bob", "Science", 55000);
        Teacher teacher3 = new Teacher("Charlie", "History", 48000);
        Teacher teacher4 = new Teacher("Diana", "English", 52000);

        Teacher[] teachers = {teacher1, teacher2, teacher3, teacher4};

        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }
}
