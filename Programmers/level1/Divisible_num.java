import java.util.*;

public class Divisible_num {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int x: arr) {
            if(x % divisor == 0) {
                answer.add(x);
            }
        }
        if(answer.isEmpty()) {
            answer.add(-1);
        }
        answer.sort(Comparator.naturalOrder());
        return answer;
    }

    public static void main(String[] args) {

    }
}
