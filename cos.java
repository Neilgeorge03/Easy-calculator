import java.util.Scanner;
public class Cos {

    private static Scanner sc;
    
    public static void main(String[]args) {
    sc= new Scanner(System.in);
    System.out.println("What is the angle to be Cosed?");
    double answer;
    answer= Math.cos(sc.nextDouble());
    System.out.println("The answer is "+answer);
    
    
}
}
