import java.util.*;

public class Crain {
	public int solution(int[][] board, int[] moves) {
		Stack<Integer> b = new Stack<>();
		int answer = 0;
		for(int m: moves) {
			for(int i=0; i<board.length; i++) {
				if(board[i][m-1] != 0) {
					if(!b.empty() && b.peek() == board[i][m-1]) {
						b.pop();
						answer += 2;
					}
					else {
						b.push(board[i][m-1]);
					}
					board[i][m-1] = 0;
					break;
				}
			}
		}
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board = {{0,0,1,0,0},{0,0,1,0,0},{0,2,1,0,0},{0,2,1,0,0},{0,2,1,0,0}};
		int[] moves = {1,2,3,3,2,3,1};
		Crain c = new Crain();
		System.out.println(c.solution(board, moves));
	}

}
