public class Missing_num {
	public int solution(int[] numbers) {
        int answer = 45;
        for(int n: numbers) {
        	answer -= n;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
