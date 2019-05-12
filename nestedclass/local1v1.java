package nestedclass;

public class local1v1 {
	// field variable ke je final hotei hobe erokom kono dhorabadha nei
private int x = 100;
void localmethod(){
	// method er vetor jodi variable final na hoto tobe seta inner class
	//use korte parto na
	final int a = 20;
	class local{
		void print(){
			System.out.println(x);
			System.out.println(a);
		}
	}
	local n = new local();
	n.print();
}
}
