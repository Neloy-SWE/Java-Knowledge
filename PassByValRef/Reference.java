package PassByValRef;

public class Reference {
int a= 10;
void change (Reference x){
	x.a=200;
}

public static void main(String[] args) {
	Reference x = new Reference();
	System.out.println(x.a);
	x.change(x);
	
	System.out.println(x.a);
	}
}
