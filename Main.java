public class Main {
    public static void main (String[] args){
        BmiService service  = new BmiService();
        long BMI = service.calculate(1.86,77);
        System.out.println(BMI);
    }
}
