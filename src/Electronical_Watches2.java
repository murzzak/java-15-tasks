import java.util.Scanner;
public class Electronical_Watches2 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int n = vvod.nextInt();
        int h = (n / 3600) % 24;
        int m = (n % 3600) / 60;
        int s = n % 60;
        System.out.printf("%d:%02d:%02d\n", h, m, s);
    }
}
