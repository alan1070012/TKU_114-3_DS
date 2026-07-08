import java.util.*;
public class DrinkMenu {
    public static void main(String[] argv){
        System.out.println("請輸入 1~3");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        switch(option){
            case 1:
                System.out.println("Black tea");
                break;
            case 2:
                System.out.println("Green tea");
                break;
            case 3:
                System.out.println("Coffee");
                break;
            default:
                System.out.println("Unkown option");
                sc.close();
        }

    }
}
