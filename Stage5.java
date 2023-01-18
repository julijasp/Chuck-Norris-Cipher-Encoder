import java.util.Scanner;

public class Stage5 {
    static Scanner scanner = new Scanner(System.in);
    static String choice;
    public static Stage3 encode = new Stage3();
    public static Stage4 decode = new Stage4();

    public static void main(String[] args) {
        printMenu();
    }

    public static void printMenu(){
        do {
            System.out.println("Please input operation (encode/decode/exit):");
            choice = scanner.nextLine();

            if (!choice.equals("encode") && !choice.equals("decode") && !choice.equals("exit")){
                System.out.println("There is no '" + choice + "' operation");
                System.out.println();
                System.out.println("Please input operation (encode/decode/exit):");
                choice = scanner.nextLine();
            }

            switch (choice){
                case "encode":
                    encode.encode();
                    System.out.println();
                    System.out.println();
                    break;
                case "decode":
                    decode.decode();
                   // System.out.println();
                    System.out.println();
                    break;
                case  "exit":
                    System.out.println("Bye!");
                    break;
            }

        }while ( !choice.equals("exit"));
    }
}
