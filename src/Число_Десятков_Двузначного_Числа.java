import java.util.Scanner;
public class Число_Десятков_Двузначного_Числа{
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int a = vvod.nextInt();
        int b = (a / 10);
        System.out.println(b);
    }
}