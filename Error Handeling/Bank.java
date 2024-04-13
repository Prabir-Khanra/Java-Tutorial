public class Bank {

	public static void main(String [] args) {

		int balance = 10000;

		int withdrawl = 12000;

		try{

			if(balance < withdrawl) {
				throw new ArithmeticException("Insufficient Balance");
			}else{
				balance = balance - withdrawl;
				System.out.println("Transaction Successful");
				System.out.println(balance);

			}


		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			
		}

	}
}


// javac Bank.java => Bank.class

// java First