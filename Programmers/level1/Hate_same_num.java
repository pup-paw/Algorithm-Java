import java.util.*;

public class Hate_same_num {
    public Stack solution(int []arr) {
        Stack<Integer> answer = new Stack();

        for(int i=0; i< arr.length; i++) {
            if(i==0 || arr[i] != answer.peek()) {
                answer.add(arr[i]);
            }
        }
        return answer;
    }
}
