public class Main {
    public static void main(String[] args) {
        BlmService service = new BlmService();
        int weightInKg = 98;
        double heightInMeters = 1.87;
        int bmi = service.calculate(weightInKg, heightInMeters); // должно получиться 28
        System.out.println(bmi);
    }
}

