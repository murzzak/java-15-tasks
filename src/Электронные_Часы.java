import java.util.Scanner;
public class Электронные_Часы {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int n = vvod.nextInt();
        int a = (n / 60) % 24;
        int b = n % 60;
        System.out.print(a + " " + b);

    }
}
