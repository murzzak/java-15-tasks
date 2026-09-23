import java.util.Scanner;
public class Next_and_Previous {
    public static void main(String[] args){
        Scanner vvod = new Scanner(System.in);
        int a = vvod.nextInt();
        int next = a + 1;
        int prev = a - 1;
        System.out.println("The next number for the number " + a + " is " + next + ".");
        System.out.println("The previous number for the number " + a + " is " + prev + ".");
    }
}
