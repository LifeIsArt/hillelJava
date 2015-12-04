package Students;

public class Student extends person {
        public int[] marks;

        public Student (){
            super(1);
            System.out.println("Students.Student const");
        }
        public void setMarks (int[] marks){

            this.marks = marks;
        }
    }

