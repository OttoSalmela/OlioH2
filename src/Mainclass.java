import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Mainclass {
    public static void main(String[] args) {
        String input1 = "";
        String input2 = "";
        System.out.print("Give a name to the dog: ");
        Scanner scan = new Scanner(System.in);
        input1 = scan.nextLine();
        Dog koira1 = new Dog(input1);
        System.out.print("What does a dog say: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            input2 = br.readLine();
        } catch (IOException e) {
            System.out.println("VIRHE!");
        }
        koira1.speak(input2);
    }
}