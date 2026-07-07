public class LoginCheck {
    public static void main(String[] argv){
      String username = "admin";
      String password = "1234";
      String inputUsername = "admin";
      String inputPassword = "1234";
      boolean LoginCheck = inputUsername.equals(username) && inputPassword.equals(password);
      System.out.println("LoginCheck " + LoginCheck ); 
      
    }
}