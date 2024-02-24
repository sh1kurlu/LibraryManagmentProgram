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
    






        
    
    
