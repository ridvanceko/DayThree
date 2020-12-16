public class TaskFive {

    public static void main (String [] args ) {

         int firstExamScore = 65;
         int secondExamScore = 80;
         int thirdExamScore = 100;
         double attendance = 80;

         int mustScore = 65;

          double exam1 = firstExamScore*0.2;
         double exam2 = secondExamScore*0.3;
         double exam3 = thirdExamScore*0.5;

         double examResult = exam1+exam2+exam3;
         boolean finalResult = attendance>=attendance && examResult>=mustScore;

        System.out.println("First Exam rate " + exam1);
        System.out.println("Second Exam rate " + exam2 );
        System.out.println("Third Exam rate " + exam3);


        System.out.println("My exam result is? : " + examResult);
        System.out.println("Did I pass the class? : " + finalResult);

        //To be able to pass the class we need to have 65 score
        //from the exams and we need to attend the 80 percent
        //of all the classes.
        //To calculate the average score we need to take take 20
        //percent of first exam score and 30 percent of second
        //exam score and 50 percent of third exam score. We
        //need to create three variable for exam scores and one
        //variable for attendance for the classes. If all conditions
        //are met, print true at the end.



    }
}
