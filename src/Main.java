import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by freemso on 2016/5/2.
 */
public class Main {
    private static final String inputFile = "input.txt";
    private static final String outputFile = "output.txt";

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File(inputFile));
            FileWriter writer = new FileWriter(new File(outputFile));
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                if (str.charAt(0) == '#') break;
                Parser parser = new Parser();
                Proposition proposition = parser.parse(str);
                if (proposition == null) {
                    writer.write(str + " ======= no\n");
                } else {
                    writer.write(str + " ======= yes\n");
                }
            }
            scanner.close();
            writer.close();
        } catch (IOException e) {
            System.out.println("no input/output file!");
        }
    }
}
