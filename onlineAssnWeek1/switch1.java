package onlineAssnWeek1;
import java.util.Scanner;
public class switch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your division");
        int div = sc.nextInt();
        switch(div) {
            case 1:
                System.out.println("1st");
                break;
            case 2:
                System.out.println("2nd");
                break;
            case 3:
                System.out.println("3rd");
            default:
                System.out.println("No Rank");
        }

    }
}
