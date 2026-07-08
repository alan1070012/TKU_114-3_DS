import java.util.*;
public class ScoreMenu {
    public static void main(String[] argv){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入姓名");
        String name = sc.next();
        System.out.println("請輸入 Java、English、Math 三科成績");
        Double Java = sc.nextDouble();
        Double English = sc.nextDouble();
        Double Math = sc.nextDouble();
        System.out.println("請輸入 0,1,2,3");
        int option = sc.nextInt();
        while(option>0) {

        switch(option){
            case 0:
                System.out.println("離開");
                break;
            case 1:
                System.out.println("平均分數:"+(Java+English+Math)/3);
                break;
            case 2:
                if((Java+English+Math)/3 >=60){
                    System.out.println("及格");
                }else{
                    System.out.println("不及格");
                }  
                break; 
            case 3:
                if((Java+English+Math)/3<60){
                    System.out.println("F");
                }else if((Java+English+Math)/3>=60&&(Java+English+Math)/3<70){
                    System.out.println("D");
                }else if((Java+English+Math)/3>=70&&(Java+English+Math)/3<80){
                    System.out.println("C");
                }else if((Java+English+Math)/3>=80&&(Java+English+Math)/3<90){
                    System.out.println("B");
                }else if((Java+English+Math)/3>=90&&(Java+English+Math)/3<100){
                    System.out.println("A");
                }
                break;
            default:      
                System.out.println("Unknown option");
                 
            } option = sc.nextInt();   
        }
        sc.close(); 


    }
    
}
