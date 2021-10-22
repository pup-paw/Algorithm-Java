
public class Add_yin_yang {
	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		for(int i=0; i<signs.length; i++) {
			answer += signs[i] ? absolutes[i] : -absolutes[i];
		}
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
