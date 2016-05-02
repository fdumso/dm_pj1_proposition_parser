/**
 * Created by freemso on 2016/5/2.
 */
public class FormationTree {
    private Proposition root;

    public FormationTree(Proposition root) {
        this.root = root;
    }

    public void print() {
        System.out.println(root.toString());
        print(root);
    }

    private void print(Proposition p) {
        if (p instanceof BinaryProp) {
            System.out.println(((BinaryProp) p).getFirst().toString() + "\t" + ((BinaryProp) p).getSecond().toString());
            print(((BinaryProp) p).getFirst());
            print(((BinaryProp) p).getSecond());
        } else if (p instanceof UnaryProp) {
            System.out.println(((UnaryProp) p).getProposition().toString());
            print(((UnaryProp) p).getProposition());
        } else if (p instanceof PropositionalLetter) {
            // do nothing
        }
    }
}
