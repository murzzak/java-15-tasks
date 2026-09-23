import java.util.Scanner;
public class МКАД {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);

        int v = vvod.nextInt();
        int t = vvod.nextInt();
        int length = 109;

        int position = ((v * t) % length + length) % length;

        System.out.println(position);
    }
}