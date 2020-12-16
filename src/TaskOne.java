public class TaskOne {

    public static void main(String [] args) {

        int k=7;
        int n=3;



        int result = k++ * ++n / ++n % k + n - k++;

        //we will start first with multiplication. Our first variable "k" has post unary number k = 7, n has pre unary number n = 4
        // 7 * 4 = 28  / n = 5

        //Ask this question to Mentor!!!!

        int $result = k + k++ * k - n++ % n + ++n;

        System.out.println();
        System.out.println();

    }
}


