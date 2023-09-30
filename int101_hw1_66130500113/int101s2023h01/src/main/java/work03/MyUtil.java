package work03;

public class MyUtil {
    
    //3.2
    public static double calculateBMI(double weight,double height){
        height=height/100;
        return weight/(height*height);
    }
    
    //3.3
    public static double average(int v1, int v2, int v3){
        double av=(v1+v2+v3)/3;
        return av;
    }
    
    
}
