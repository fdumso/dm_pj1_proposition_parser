/**
 * Created by freemso on 2016/5/2.
 */
public abstract class Proposition {
    protected String text;

    public Proposition(String text) {
        this.text = text;
    }

    public String toString() {
        return text;
    }

    public abstract void printSuc();
}
