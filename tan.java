import java.util.Scanner;
public class Tan {
    private static Scanner sc;
    public static void main(String[]args) {
    sc= new Scanner(System.in);
    System.out.println("The angle to be taned is?");
    double answer;
    answer= Math.tan(sc.nextDouble());
    System.out.println("The answer is "+answer);
    }
}
