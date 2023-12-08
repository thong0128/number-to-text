import java.util.Scanner;

public class NumberToText {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Integer a:");
        int a = input.nextInt();
        String x, y ,z;
        switch (a/100) {
            case 0:
                x = "Zero";
                break;
            case 1:
                x = "One";
                break;
            case 2:
                x = "Two";
                break;
            case 3:
                x = "Three";
                break;
            case 4:
                x = "Four";
                break;
            case 5:
                x = "Five";
                break;
            case 6:
                x = "Six";
                break;
            case 7:
                x = "Seven";
                break;
            case 8:
                x = "Eight";
                break;
            case 9:
                x = "Nine";
                break;
            case 10:
                x = "Ten";
                break;
        }

    }
}
