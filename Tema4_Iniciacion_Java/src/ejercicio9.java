import java.util.Scanner;

public class ejercicio9 {
    public static void main (String[]args){
        int hour, minute, second ;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la hora, minuto y segundo");
        hour = sc.nextInt();
        minute = sc.nextInt();
        second = sc.nextInt();

        second++;

        if (second >= 60){
            second = 0;
            minute++;
            if (minute >= 60){
                minute = 0;
                hour++;
                if (hour >= 24){
                    hour = 0;
                }
            }
        }
        System.out.println("La nueva hora es : " + hour + ":" + minute + ":" + second);
    }
}
