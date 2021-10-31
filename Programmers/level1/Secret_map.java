public class Secret_map {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0; i<n; i++) {
            String s = String.format("%"+n+"d",Long.parseLong(Integer.toBinaryString(arr1[i]|arr2[i])));
            s = s.replace("1", "#");
            s = s.replace("0", " ");
            answer[i] = s;
        }
        return answer;
    }

    public static void main(String[] args) {
        Secret_map m = new Secret_map();
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        System.out.println(m.solution(5, arr1, arr2));
    }
}
