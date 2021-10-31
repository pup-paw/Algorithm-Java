public class Sum_between {
    public long solution(long a, long b) {
        return (a + b) * ((Math.abs(b - a) + 1 ) / 2);
    }
}
