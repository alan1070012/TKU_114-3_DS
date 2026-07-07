import java.util.*;
public class TemperatureLevel {
    public static void main(String[] argv){
        Scanner sc=new Scanner(System.in);
        double temperature = sc.nextDouble();

        if (temperature<15){
            System.out.println("Temperature level: Cold");
         }else if (temperature>=15&&temperature<28){
            System.out.println("Temperature level: Comfortable");
        }else{
            System.out.println("Temperature level: Hot");
        }
    }
}

