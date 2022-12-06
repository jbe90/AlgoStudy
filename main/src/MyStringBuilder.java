import java.util.ArrayList;
import java.util.Arrays;


public class MyStringBuilder {

    ArrayList<String> strings;

    MyStringBuilder() {
        this.strings = new ArrayList();
    }

    public void append(String str) {
        this.strings.add(str);
    }

    public String toString() {

        return   String.join("", strings);
    }
}
