import java.util.Scanner;
public class Следующее_Чётное {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int a = vvod.nextInt();
        int b = (a/2 + 1) * 2;
        System.out.println(b);
    }
}
