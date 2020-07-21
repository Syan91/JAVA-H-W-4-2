public class BmiService {
    public double calculate (double height,long weight){
       double bmi = weight/(height*height);
       return (double) bmi;
    }
}
