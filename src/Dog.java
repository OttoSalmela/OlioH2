import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

public class Dog {

    private String name;
    private String says;

    public Dog(String n) {
        says = "Much wow!";
        name = n.strip();
        if (name.isEmpty())
            name = "Doge";
        System.out.println("Hey, my name is " + name);

    }

    public void speak(String s) {
        s = s.strip();
        if (s.isEmpty()) {
            speak(says);
            System.out.print("What does a dog say: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                s = br.readLine();
            } catch (IOException e) {
                System.out.println("VIRHE!");
            }
            speak(s);
        } else{
            Scanner scan  = new Scanner(s);
            while (scan.hasNext()) {
                if (scan.hasNextBoolean()) {
                    System.out.println("Such boolean: " + scan.nextBoolean());
                }else if (scan.hasNextInt()){
                    System.out.println("Such integer: " + scan.nextInt());
                }else{
                    System.out.println(scan.next());
                }
            }
        }
    }
}