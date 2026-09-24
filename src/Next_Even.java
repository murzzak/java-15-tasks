import java.util.Scanner;
public class Next_Even {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int a = vvod.nextInt();
        int b = (a/2 + 1) * 2;
        System.out.println(b);
    }
}
