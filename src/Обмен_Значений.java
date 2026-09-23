import java.util.Scanner;
public class Обмен_Значений {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int a = vvod.nextInt();
        int b = vvod.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}