import java.util.Scanner;

public class Stage4 {
    public static void decode () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input encoded string:");
        String text = scanner.nextLine();
        boolean invalidString = false;
        int spaceCount = 0;
        for (char c : text.toCharArray()) {
            if (c != '0' && c != ' ') {
                invalidString = true;
            }
            if (text.substring(0, text.indexOf(" ")).length() > 2) {
                invalidString = true;
            }
            if (c == ' ') {
                spaceCount++;
            }
        }
        if (invalidString == true || (spaceCount + 1) % 2 != 0) {
            System.out.println("Encoded string is not valid.");
        } else {

            String[] textSplitted = text.split(" "); //0 0 00 0000 0 000 00 0000 0 00
            int num = textSplitted.length; //10
            String[] zeroOne = new String[num / 2];
            String binaryLine = "";
            int[] numRepeat = new int[num / 2];
            int a = 0;
            for (int i = 0; i < num; i = i + 2) { //1 0 1 0 1
                if (textSplitted[i].equals("0")) {
                    zeroOne[i / 2] = "1";
                } else {
                    zeroOne[i / 2] = "0";
                }
            }
            for (int i = 1; i < num; i = i + 2) { //1 4 3 4 2
                numRepeat[a] = textSplitted[i].length();
                a += 1;
            }

            String[] binary = new String[num / 2];
            for (int i = 0; i < num / 2; i++) {
                binary[i] = zeroOne[i].repeat(numRepeat[i]); //1 0000 111 0000 11
                binaryLine += binary[i]; //10000111000011
            }
            //System.out.println(binaryLine);
            if (binaryLine.length() % 7 != 0) {
                System.out.println("Encoded string is not valid.");
            } else {
                System.out.println("Decoded string:");
                for (int i = 0; i < binaryLine.length(); i = i + 7) {
                    String bSeven = binaryLine.substring(i, i + 7);
                    int decimal = Integer.parseInt(bSeven, 2);
                    char character = (char) decimal;
                    System.out.print(character);
                }
                System.out.println();
            }
        }
    }
}
