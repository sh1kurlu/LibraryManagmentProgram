package week05;
import java.util.Arrays;

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
        private String courses;
    
        public PhdStudent(String firstName, String lastName, String gender, int studentId, String department, String courses) {
            super(firstName, lastName, gender, studentId);
            this.department = department;
            this.courses = courses;
        }
        
        @Override
        public String toString() {
            return "PhdStudent{" +
                    "department='" + department + '\'' +
                    ", courses='" + courses + '\'' +
                    "} " + super.toString();
        }
    
        public boolean equals(PhdStudent pStud) {
            return super.equals(pStud) &&
                    this.department.equals(pStud.department) &&
                    this.courses.equals(pStud.courses);
        }
    }

    

public class Inheritance {
    public static void main(String[] args) {
        testPerson();
        testTeacher();
        testStudent();
        testPhdStudent();
    }

    private static void testPerson() {
        Person person1 = new Person("John", "Doe", "Male");
        Person person2 = new Person("Jane", "Doe", "Female");

        System.out.println(person1);
        System.out.println(person2);

    }

    private static void testTeacher() {
        String[] courses = {"Math", "Physics"};
        Teacher teacher1 = new Teacher("Science", courses, "Alice", "Smith", "Female");
        Teacher teacher2 = new Teacher("English", courses, "Bob", "Johnson", "Male");

        System.out.println(teacher1);
        System.out.println(teacher2);

    }

    private static void testStudent() {
        Student student1 = new Student("Eva", "Green", "Female", 12345);
        Student student2 = new Student("Tom", "Brown", "Male", 67890);

        System.out.println(student1);
        System.out.println(student2);

        
    }

    private static void testPhdStudent() {
        PhdStudent phdStudent1 = new PhdStudent("Sam", "White", "Male", 54321, "Computer Science", "Algorithms");
        PhdStudent phdStudent2 = new PhdStudent("Lisa", "Jones", "Female", 98765, "Physics", "Quantum Mechanics");

        System.out.println(phdStudent1);
        System.out.println(phdStudent2);

        
    }
}

    