package ExceptionHandling;

public class useCustom1v1 {
	static void election3(int a) throws TimeOutException{
		if(a<18){
			throw new TimeOutException("Not eligible for vote");
		}
		else {
			System.out.println("Eligible for vote");
		}
	}
}
