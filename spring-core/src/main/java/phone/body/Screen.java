package phone.body;

/**
 * Created by krishan on 8/13/15.
 */
public class Screen {
    public static enum Type{
        LED,
        LCD;
    }
    float size;
    Type type;

    public Screen(float size, Type type) {
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "size=" + size +
                ", type=" + type +
                '}';
    }
}
