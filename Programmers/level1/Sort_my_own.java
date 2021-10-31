import java.util.Arrays;
import java.util.Comparator;

public class Sort_my_own {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        int i = 0;
        Arrays.sort(strings);
        for(String x : strings) {
            answer[i] = x.substring(n,n+1);
            i++;
        }
        Arrays.sort(answer);
        i = 0;
        for(String x : answer) {
            int j = 0;
            for(String y : strings) {
                if(y.substring(n, n+1).equals(x)) {
                    answer[i] = x.replace(x, y);
                    strings[j] = y.replace(x, "*");
                }
                j++;
            }
            i++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Sort_my_own s = new Sort_my_own();
        String[] strings = {"sun", "bed", "car"};
        System.out.println(s.solution(strings, 1));
    }
}
