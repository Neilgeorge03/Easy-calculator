import java.util.Scanner;
public class Sin {

    private static Scanner sc;
    public static void main(String[]args) {
    sc= new Scanner(System.in);
    System.out.println("What is the angle to be sined?");
    double    answer;
    answer= Math.sin(sc.nextDouble());
    System.out.println("The answer is "+answer);



}
}
