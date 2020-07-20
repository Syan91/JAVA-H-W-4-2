public class BmiService {
    public long calculate (double height,long weight){
       double BMI = weight/(height*height);
       return (long) BMI;
    }
}
