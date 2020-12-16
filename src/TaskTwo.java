public class TaskTwo {

    public static void main(String [] args) {

        //Create the application to print true if there is enough space for NBA
        //game and print false if there is no ticket for the game. To be able to
        //calculate the result you need to store max capacity of the stadium
        //and total number of ticket which is sold.
        //If the there is no ticket left print false, otherwise print false.


        int maxCapacity = 500;
        int soldTicket = 500;
        boolean yayNba = false;

        boolean nbaTicket = soldTicket<=maxCapacity || yayNba;


        System.out.println("Can I watch the Bulls game tonight? " + yayNba);





    }
}
