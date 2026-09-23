import java.util.Scanner;
public class Hypotenuse {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        double a = vvod.nextDouble();
        double b = vvod.nextDouble();
        double c = Math.sqrt(a*a + b*b);
        System.out.println(c);
    }
}