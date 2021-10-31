import java.util.Arrays;
import java.util.Comparator;

public class Str_descending {
    public String solution(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        StringBuffer sb = new StringBuffer(String.valueOf(c));
        return sb.reverse().toString();
    }
}
