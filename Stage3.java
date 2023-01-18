
import java.util.Scanner;

public class Stage3 {

    public static void encode () {
        System.out.println("Input string:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String binarNumber = null;

        char[] ch = s.toCharArray();
        int[] charNumber = new int[s.length()];
        System.out.println("Encoded string:");

        String c = "";
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            int b = a; // dec val of char
            c += String.format("%7s", Integer.toBinaryString(b)).replace(' ', '0');
        }

        String[] stringArray = c.split("");

        String o = stringArray[0];

              if (stringArray[0].equals("0")) {
            System.out.print("00 ");
        } else {
            System.out.print("0 ");
        }

        for (int i = 0; i < stringArray.length; i++) {
            if (!o.equals(stringArray[i])) {
                if (stringArray[i].equals("0")) {
                    System.out.print(" 00 0");
                } else {
                    System.out.print(" 0 0");
                }
                o = stringArray[i];
            } else {
                System.out.print("0");
                continue;
            }

        }
    }
}



