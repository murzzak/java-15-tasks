import java.util.Scanner;
public class Число_Десятков{
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int a = vvod.nextInt();
        int b = (a / 10) % 10;
        System.out.println(b);
    }
}