import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int a = vvod.nextInt();
        int ed = a % 10;
        int sot = a / 100;
        int des = (a / 10) % 10;
        System.out.println(ed+sot+des);
    }
}