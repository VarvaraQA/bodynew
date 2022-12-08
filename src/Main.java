public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 67;
        double width = 1.73;
        int cost = service.calculate(height, width);
        System.out.println(cost);
    }
}