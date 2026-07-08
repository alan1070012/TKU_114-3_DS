import java.util.*;
public class HealthAdvisor {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        
        
        while(true){
        System.out.println("請輸入姓名:");
        String name = sc.next();
        System.out.println("請輸入身高（公尺):");
        double height = sc.nextDouble();
        System.out.println("請輸入體重（公斤）：");
        double weight = sc.nextDouble();       
        double BMI =weight/(height*height);
        System.out.println("BMI:"+BMI);

        if(BMI<18.5 && BMI>0){
            System.out.println("Level: Underweight");
        }else if(BMI<24 && BMI>=18.5){
            System.out.println("Level: Normal");
        }else if(BMI<27 && BMI>=24){
            System.out.println("Level: Overweight");
        }else if(BMI>=27){
            System.out.println("Level: Obese");
        }
        
        System.out.println("是否繼續輸入下一筆？(y/n):");
        String ans = sc.next();
        if(!ans.equals("y")){
            break;
        }
        
        }
        sc.close();
    }
}

