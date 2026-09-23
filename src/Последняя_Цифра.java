import java.util.Scanner;
public class Последняя_Цифра{
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int a = vvod.nextInt();
        int b = (a % 10);
        System.out.println(b);
    }
}