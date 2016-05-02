/**
 * Created by freemso on 2016/5/2.
 */
public class BinaryProp extends Proposition {
    private Proposition first;
    private Proposition second;
    private Connective connective;

    public BinaryProp(String text, Proposition first, Proposition second, Connective connective) {
        super(text);
        this.first = first;
        this.second = second;
        this.connective = connective;
    }

    public Proposition getFirst() {
        return first;
    }

    public Proposition getSecond() {
        return second;
    }

    public void setFirst(Proposition first) {
        this.first = first;
    }

    public void setSecond(Proposition second) {
        this.second = second;
    }
}
