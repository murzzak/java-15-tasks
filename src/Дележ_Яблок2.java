import java.util.Scanner;
public class Дележ_Яблок2 {
    public static void main(String[] args){
        Scanner vvod = new Scanner(System.in);
        int n = vvod.nextInt();
        int k = vvod.nextInt();
        int result = k % n;
        System.out.println(result);
    }
}
