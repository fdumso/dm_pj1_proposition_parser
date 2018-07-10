/**
 * Created by freemso on 2016/5/2.
 */
public class Connective {
    private Type type;

    enum Type {
        AND, OR, NOT, IMPLY, EQ
    }

    public Connective(Type type) {
        this.type = type;
    }

    public String toString() {
        switch (type) {
            case AND: return "\\and";
            case OR: return "\\or";
            case NOT: return "\\not";
            case IMPLY: return "\\imply";
            case EQ: return "\\eq";
            default: return "";
        }
    }
}
