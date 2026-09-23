import java.util.Scanner;
public class Конец_Уроков {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int n = vvod.nextInt();
        int totalMinutes = n * 45;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                totalMinutes += 15;
            } else {
                totalMinutes += 5;
            }
        }
        int hours = 9 + totalMinutes / 60;
        int minutes = totalMinutes % 60;
        System.out.println(hours + " " + minutes);
    }
}