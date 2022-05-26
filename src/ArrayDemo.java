public class ArrayDemo {
     /**
      *
      *  String[] args = {"2", "4"}
      * */
    public static void main(String[] args) {
        // Building an array variable to store multiple integer type of data
        // Array length is fixed
      int[]  studentId = { 101, 102, 103, 104 };
      // Add value into studentId
      studentId[3] =  105;
        // Get first index value form an array. arrayName[indexNumber]
        System.out.println("First Student ID: " + studentId[0]);

        // Declare an array with Size/Length using new keyword
        char[] studentGrade = new char[5]; // Is there any element in studentGrade array? -- > Empty
        // Highest index number = lengthOfArray - 1
        studentGrade[0] = 'A';
        studentGrade[1] = 'B';
        studentGrade[2] = 'C';
        studentGrade[3] = 'A';
        studentGrade[4] = 'F';

        System.out.println(studentGrade);

        String argsValue0 = args[0];
        String argsValue1 = args[1];
        System.out.println("My Full Name: " + argsValue0 + " " + argsValue1);


    }

}

