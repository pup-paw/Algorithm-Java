import java.util.*;

public class Keypad {
	public String solution(int[] numbers, String hand) {
		
		List<Integer> num1 = new ArrayList<>(Arrays.asList(1, 4, 7));
		List<Integer> num2 = new ArrayList<>(Arrays.asList(2, 5, 8, 0));
		List<Integer> num3 = new ArrayList<>(Arrays.asList(3, 6, 9));
		int[] r = {3, 2};
		int[] l = {3, 0};
        String answer = "";
        
        for(int n: numbers) {
        	if(num1.contains(n)) {
        		answer += "L";
        		l[0] = num1.indexOf(n);
        		l[1] = 0;
        	}
        	else if(num3.contains(n)) {
        		answer += "R";
        		r[0] = num3.indexOf(n);
        		r[1] = 2;
        	}
        	else {
        		int[] now = {num2.indexOf(n), 1};
        		int dr = Math.abs(r[0]-now[0]) + Math.abs(r[1]-now[1]);
        		int dl = Math.abs(l[0]-now[0]) + Math.abs(l[1]-now[1]);
        		if(dr > dl || (dr == dl && hand.equals("left"))) {
        			answer += "L";
            		l = now;
        		}
        		else {
        			answer += "R";
            		r = now;
        		}
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Keypad k = new Keypad();
		int[] a = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		System.out.println(k.solution(a, "left"));
	}

}
