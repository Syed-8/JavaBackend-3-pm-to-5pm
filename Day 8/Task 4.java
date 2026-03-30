package Assignment8;
class Login{
	
	void login(String username , String Password) {
		if(username.equals("Irfan0")&&Password.equals("1234")) {
			System.out.println("Username and Password Login Successfully ");
		}else{
			System.out.println("INvalid Username and Password ");
		}
	}
	
	void login(String email,String password ,boolean Login) {
		if (email.equals("admin@gmail.com") && password.equals("irfu")) {
            System.out.println("Email Login Successful!");
        } else {
            System.out.println("Invalid Email or Password!");
        }
	}
	
	 void login(long mobileNumber, int otp) {

	        if (mobileNumber == 987687765 && otp == 4567) {
	            System.out.println("Mobile Login Successful!");
	        } else {
	            System.out.println("Invalid Mobile Number or OTP!");
	        }
	    }
}

	
	

public class LoginStatus {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Login l1= new Login();
		l1.login("Irfan0","1234");
		l1.login("admin@gmail.com","irfu",true);
		l1.login(987687765,4567);
		
		
		
	}

}
