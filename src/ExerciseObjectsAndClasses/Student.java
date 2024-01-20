package ExerciseObjectsAndClasses;

public class Student {
//4
        private String firstName;
        private String lastName;
        private double grade;


        public Student(String firstName, String lastName, double grade) {

            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }




        public double getGrade() {
            return this.grade;
        }


        public String getFirstName() {
            return this.firstName;
        }


        public String getLastName() {
            return this.lastName;
        }
}
