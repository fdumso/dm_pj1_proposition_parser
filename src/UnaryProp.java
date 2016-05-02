/**
 * Created by freemso on 2016/5/2.
 */
public class UnaryProp extends Proposition {
    private Proposition proposition;
    private Connective connective;

    public UnaryProp(String text, Proposition proposition, Connective connective) {
        super(text);
        this.proposition = proposition;
        this.connective = connective;
    }

    public Proposition getProposition() {
        return proposition;
    }
}
