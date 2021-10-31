public class Ride_price {
    public long solution(long price, long money, long count) {
        price *= (count + 1) * count / 2;
        return Math.max(0, price - money);
    }
}
