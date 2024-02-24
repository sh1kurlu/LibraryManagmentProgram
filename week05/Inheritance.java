package week05;
import java.util.Arrays;
import java.util.Scanner;

    class Person{
        private String firstName;
        private String lastName;
        private String gender;

        public Person(String firstName, String lastName, String gender){
            this.firstName = firstName;
            this.lastName = lastName;
            this.gender = gender;
        }

        public String getFirstName(){
            return firstName;
        }

        public void setFirstName(String firstName){
            this.firstName = firstName;
        }

        public String getLastName(){
            return lastName;
        }

        public void setLastName(String lastName){
            this.lastName = lastName;
        }

        public String getGender(){
            return gender;
        }

        public void setGender(String gender){
            this.gender = gender;
        }

        @Override
        public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
        }
        public boolean equals(Person p) {
         return this.firstName.equals(p.getFirstName()) &&
               this.lastName.equals(p.getLastName()) &&
               this.gender.equals(p.getGender());
        }
    }

    class Teacher extends Person{
        private String department;
        private String[] courses;

        public Teacher(String department, String[] courses, String firstName, String lastName, String gender){
          super(firstName, lastName, gender); 
          this.department = department;
          this.courses = courses;
           
        }

        public String getDepartment(){
            return department;
        }

        public void setDepartment(String department){
            this.department = department;
        }

        public String[] getCourses(){
            return courses;
        }

        public void setCourses(String []courses){
            this.courses = courses;
        }

        @Override
        public String toString() {
        return "Teacher{" +
                "department='" + department + '\'' +
                ", courses=" + Arrays.toString(courses) +
                "} " + super.toString();
    }

        public boolean equals(Teacher t) {
           return super.equals(t) &&
               this.department.equals(t.getDepartment()) &&
               Arrays.equals(this.courses, t.getCourses());
    }

    }

    class Student extends Person {
        private int studentId;
    
        public Student(String firstName, String lastName, String gender, int studentId) {
            super(firstName, lastName, gender);
            this.studentId = studentId;
        }
        
        @Override
        public String toString() {
            return "Student{" +
                    "studentId=" + studentId +
                    "} " + super.toString();
        }
    
        public boolean equals(Student s) {
            return super.equals(s) && this.studentId == s.studentId;
        }
    }
    
    class PhdStudent extends Student {
        private String department;
        private String[] courses;
    
        public PhdStudent(String firstName, String lastName, String gender, int studentId, String department, String[] courses) {
            super(firstName, lastName, gender, studentId);
            this.department = department;
            this.courses = courses;
        }
    
        @Override
        public String toString() {
            return "PhdStudent{" +
                    "department='" + department + '\'' +
                    ", courses=" + Arrays.toString(courses) +
                    "} " + super.toString();
        }
    
        public boolean equals(PhdStudent pStud) {
            return super.equals(pStud) &&
                    this.department.equals(pStud.department) &&
                    Arrays.equals(this.courses, pStud.courses);
        }
    }
    

    

public class Inheritance {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            testPerson(scanner);
            testTeacher(scanner);
            testStudent(scanner);
            testPhdStudent(scanner);
    
            scanner.close();
        }
    
        private static void testPerson(Scanner scanner) {
            System.out.println("Enter details for Person:");
            System.out.print("Enter first name: ");
            String firstName = scanner.next();
            System.out.print("Enter last name: ");
            String lastName = scanner.next();
            System.out.print("Enter gender: ");
            String gender = scanner.next();
    
            Person person = new Person(firstName, lastName, gender);
            System.out.println("Created Person: " + person);
        }
    
        private static void testTeacher(Scanner scanner) {
            System.out.println("Enter details for Teacher:");
            System.out.print("Enter department: ");
            String department = scanner.next();
            System.out.print("Enter number of courses: ");
            int numCourses = scanner.nextInt();
            String[] courses = new String[numCourses];
            System.out.println("Enter course names (separated by spaces):");
            for (int i = 0; i < numCourses; i++) {
                courses[i] = scanner.next();
            }
            System.out.print("Enter first name: ");
            String firstName = scanner.next();
            System.out.print("Enter last name: ");
            String lastName = scanner.next();
            System.out.print("Enter gender: ");
            String gender = scanner.next();
    
            Teacher teacher = new Teacher(department, courses, firstName, lastName, gender);
            System.out.println("Created Teacher: " + teacher);
        }
    
        private static void testStudent(Scanner scanner) {
            System.out.println("Enter details for Student:");
            System.out.print("Enter first name: ");
            String firstName = scanner.next();
            System.out.print("Enter last name: ");
            String lastName = scanner.next();
            System.out.print("Enter gender: ");
            String gender = scanner.next();
            System.out.print("Enter student ID: ");
            int studentId = scanner.nextInt();
    
            Student student = new Student(firstName, lastName, gender, studentId);
            System.out.println("Created Student: " + student);
        }
    
        private static void testPhdStudent(Scanner scanner) {
            System.out.println("Enter details for PhdStudent:");
            System.out.print("Enter department: ");
            String department = scanner.next();
            System.out.print("Enter number of courses: ");
            int numCourses = scanner.nextInt();
            String[] courses = new String[numCourses];
            System.out.println("Enter course names (separated by spaces):");
            for (int i = 0; i < numCourses; i++) {
                courses[i] = scanner.next();
            }
            System.out.print("Enter first name: ");
            String firstName = scanner.next();
            System.out.print("Enter last name: ");
            String lastName = scanner.next();
            System.out.print("Enter gender: ");
            String gender = scanner.next();
            System.out.print("Enter student ID: ");
            int studentId = scanner.nextInt();
        
            PhdStudent phdStudent = new PhdStudent(firstName, lastName, gender, studentId, department, courses);
            System.out.println("Created PhdStudent: " + phdStudent);
        }
        
    }
    

    