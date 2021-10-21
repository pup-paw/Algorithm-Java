
public class New_id {
	public String solution(String new_id) {
		// 1
		new_id = new_id.toLowerCase();
		//2
		new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
		//3
		while(new_id.contains("..")) {
			new_id = new_id.replace("..", ".");
		}
		//4
		if(new_id.substring(0, 1).equals(".")) {
			new_id = new_id.substring(1, new_id.length());
		}
		if(new_id.length() > 0) {
			if(new_id.substring(new_id.length()-1).equals(".")) {
				new_id = new_id.substring(0, new_id.length()-1);
			}
		}
		//5
		if(new_id.equals("")) {
			new_id = "a";
		}
		//6
		if(new_id.length() >= 16) {
			new_id = new_id.substring(0, 15);
		}
		if(new_id.substring(new_id.length()-1).equals(".")) {
			new_id = new_id.substring(0, new_id.length()-1);
		}
		//7
		if(new_id.length() <= 2) {
			for(int i=0; i<4-new_id.length(); i++) {
				new_id = new_id + new_id.substring(new_id.length()-1);
			}
		}
        return new_id;
    }
	
	public static void main(String[] args) {
		New_id id = new New_id();
		System.out.println(id.solution("abcdefghijklmn.p"));
	}
}
