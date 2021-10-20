
public class Lotto {
	public int[] solution(int[] lottos, int[] win_nums) {
        int tmp = 0;
        int zero = 0;
        for(int lotto:lottos) {
        	if(lotto == 0) {
        		zero += 1;
        	}
        	for(int num:win_nums) {
            	if(lotto == num) {
            		tmp ++;
            		break;
            	}
        	}
        }
        int[] answer = {7-Math.max(tmp+zero, 1), 7-Math.max(tmp, 1)};
        return answer;
    }
	
	public static void main(String[] args) {
		int[] lotto = {0, 0, 0, 0, 0, 0};
		int[] win_nums = {38, 19, 20, 40, 15, 25};
		
		Lotto myLotto = new Lotto();
		int[] s = myLotto.solution(lotto, win_nums);
		System.out.print(s[0]+" ");
		System.out.print(s[1]);
	}
}
