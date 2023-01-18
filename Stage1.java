import java.util.Scanner;

public class Stage1 {

    public static void main(String[] args) {
        System.out.println("Input string:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String newS = s.replaceAll("", " ");
        System.out.println(newS);
    }
}
