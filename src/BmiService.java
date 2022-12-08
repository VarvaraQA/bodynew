public class BmiService {
    public int calculate (double height, double width) {
        int cost = (int) (height / (width * width));
        return (int) cost;
    }
}
