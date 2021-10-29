import java.util.ArrayList;

public class Dart {
    public int solution(String dartResult) {
        int answer = 0;
        ArrayList<String> dart = new ArrayList<>();
        ArrayList<Integer> point = new ArrayList<>();
        dartResult = dartResult.replace("10", "x");
        for(char x : dartResult.toCharArray()) {
            if("x".equals(Character.toString(x))) {
                dart.add("10");
            }
            else {
                dart.add(Character.toString(x));
            }
        }

        int i = -1;
        for(String x : dart) {
            if("S".equals(x)) {
                continue;
            }
            else if("D".equals(x)) {
                point.set(i, (int) Math.pow(point.get(i), 2));
            }
            else if("T".equals(x)) {
                point.set(i, (int) Math.pow(point.get(i), 3));
            }
            else if("*".equals(x)) {
                if(i != 0) {
                    point.set(i-1, point.get(i-1)*2);
                }
                point.set(i, point.get(i)*2);
            }
            else if("#".equals(x)) {
                point.set(i, point.get(i)*(-1));
            }
            else {
                point.add(Integer.parseInt(x));
                i++;
            }
        }
        return point.stream().mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) {
        Dart d = new Dart();
        System.out.println(d.solution("1D2S#10S"));
    }
}
