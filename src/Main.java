public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        float bigWeight = service.calculate(165, 100);
        System.out.println(bigWeight);

        float smallWeight = service.calculate(180, 40);
        System.out.println(smallWeight);

        float normalWeight = service.calculate(155, 60);
        System.out.println(normalWeight);
    }
}
