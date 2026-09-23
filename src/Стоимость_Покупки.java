import java.util.Scanner;
public class Стоимость_Покупки {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int a = vvod.nextInt();
        int b = vvod.nextInt();
        int n = vvod.nextInt();
        int rub = a * n;
        int kop = b * n;
        System.out.print(rub + " " + kop);
    }
}
