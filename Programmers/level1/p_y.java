import java.util.Locale;

public class p_y {
    boolean solution(String s) {
        s = s.toLowerCase();
        return s.chars().filter(p -> p == 'p').count() == s.chars().filter(y -> y == 'y').count();
    }
}
