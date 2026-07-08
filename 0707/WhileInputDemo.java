import java.util.*;
public class WhileInputDemo {
    public static void main(String[] argv){

        System.out.println("請輸入整數");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        

        while (num != 0) {
            
            System.out.println("請輸入下一個整數");
            num = sc.nextInt();
        }
        sc.close();
    }
}
