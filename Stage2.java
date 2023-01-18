import java.util.Scanner;

public class Stage2 {

    public static void main(String[] args) {
        System.out.println("Input string:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        char[] ch = s.toCharArray();
        int[] charNumber = new int[s.length()];
        System.out.println("The result:");

        for (int i = 0 ; i < s.length(); i++) {
            charNumber[i] = (int)ch[i];
            System.out.println( ch [i] + " = " + String.format("%7s", Integer.toBinaryString(charNumber[i])).replace(" ", "0"));
        }

            }
}
