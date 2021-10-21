import java.util.*;

public class English_word {
	public int solution(String s) {
		Map<String, String> num = new HashMap<String, String>();
		num.put("zero", "0");
		num.put("one", "1");
		num.put("two", "2");
		num.put("three", "3");
		num.put("four", "4");
		num.put("five", "5");
		num.put("six", "6");
		num.put("seven", "7");
		num.put("eight", "8");
		num.put("nine", "9");
		
		for(String key: num.keySet()) {
			s = s.replaceAll(key, num.get(key));
		}
        return Integer.parseInt(s);
    }
	
	public static void main(String[] args) {
		English_word word = new English_word();
		System.out.println(word.solution("one4seveneight"));
	}
}
