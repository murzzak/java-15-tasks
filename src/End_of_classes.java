import java.util.Scanner;
public class End_of_classes {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int n = vvod.nextInt();
        int breaks = n - 1;
        int shortBreaks;
        int longBreaks;
        if (breaks % 2 == 0) {
            shortBreaks = breaks / 2;
            longBreaks = breaks / 2;

        } else {
            shortBreaks = breaks / 2 + 1;
            longBreaks = breaks / 2;

        }

        int totalMinutes = n * 45 + shortBreaks * 5 + longBreaks * 15;
        int hours = 9 + totalMinutes / 60;
        int minutes = totalMinutes % 60;
        System.out.println(hours + " " + minutes);
    }
}