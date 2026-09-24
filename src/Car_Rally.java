import java.util.Scanner;
public class Car_Rally{
    public static void main(String[] args)  {
        Scanner vvod = new Scanner(System.in);
        int n = vvod.nextInt();
        int m = vvod.nextInt();
        int res = (m + n - 1) / n;
        System.out.println(res);
    }
}