package Covariant;

 class CO1v1 {
int a= 10;
}

class CO1v2 extends CO1v1{
	int b= 20;
}
class CO1v3 {
	CO1v1 xxx(){
		System.out.println("Super class");
		return new CO1v1();
		
		//new CO1v1 holo ekta anonymous object
	}
}
public class CovariantReturn extends CO1v3{
	CO1v1 xxx (){
		System.out.println("Sub class");
		return new CO1v2();
	}
	
}