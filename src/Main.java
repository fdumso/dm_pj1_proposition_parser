import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by freemso on 2016/5/2.
 */
public class Main {
    public static void main(String[] args) {
        test();
        try {
            Scanner scanner = new Scanner(new File("input.txt"));
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                Parser parser = new Parser();
                Proposition proposition = parser.parse(str);
                if (proposition == null) {
                    System.out.print(str + "\tis not a valid proposition!");
                } else {
                    FormationTree tree = new FormationTree(proposition);
                    tree.print();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.print("no input file!");
        }
    }

    private static void testValidCase(String str) {
        Parser parser = new Parser();
        if (parser.parse(str) == null) {
            System.err.println("Test failed: " + str);
        }
    }

    private static void testInvalidCase(String str) {
        Parser parser = new Parser();
        if (parser.parse(str) != null) {
            System.err.println("Test failed: " + str);
        }
    }

    public static void test() {
        testValidCase("a");
        testValidCase("(\\not a)");
        testValidCase(" ( \\not (\\not A_{3})  ) ");
        testValidCase("((\\not a) \\and (Z_{0} \\eq p))");
        testValidCase("(\\not(\\not(\\not(\\not(\\not(\\not(\\not(\\not(\\not(\\not(\\not(\\not(\\not(\\not a))))))))))))))");
        testValidCase("((z \\eq (\\not (c \\imply (\\not (D \\eq J))))) \\or ((\\not a) \\imply (\\not B)))");

        testInvalidCase("");
        testInvalidCase("\\");
        testInvalidCase("(a)");
        testInvalidCase("((\\not a))");
        testInvalidCase("((a \\imply b))");
        testInvalidCase("((a \\and b");
        testInvalidCase("s_{}");
        testInvalidCase("(\\not Se_{32)");
        testInvalidCase("(a \\f b)");
        testInvalidCase("(a a \\and b)");
        testInvalidCase("((\\not jf_) \\imply b)");
        testInvalidCase("(a \\imply (b))");
    }
}
