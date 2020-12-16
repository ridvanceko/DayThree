public class TaskSix {

    public static void main (String [] args) {

        int targetWalk = 10000;
        int targetRun = 5;
        int targetEat = 1500;


        int walk = 11000;
        int run = 5;
        int eat = 1400;

        double target = 10;
        boolean success = walk>=targetWalk || run>=targetRun && eat<=targetEat;

        System.out.println("Can David achieve his target? " + success);

        //David wants to lose the 10 kg in one month. There are
        //multiple condition to lose the 10 kg in month. David needs
        //to walk 10000 steps a daily or needs to run 4 miles a day
        //additional to those David needs to eat less than 1500
        //calories daily. Create the application that calculate the
        //given parameter and will print the true if David is able to
        //lose 10 kg in one month.


    }
}
