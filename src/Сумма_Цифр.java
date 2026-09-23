import java.util.Scanner;
public class Сумма_Цифр{
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int inp = vvod.nextInt();
        int a = inp / 100;
        int b = (inp / 10) % 10;
        int c = inp % 10;
        System.out.println(a+b+c);
    }
}