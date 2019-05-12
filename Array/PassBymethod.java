package Array;

public class PassBymethod {
int [] backArray(){
	int []a={10, 20, 30};
	return a;
}

static int[] backArray2(){
	int []a={40, 50, 60};
	return a;
}

public static void main(String[] args) {
	PassBymethod obj = new PassBymethod();
	int a[]=obj.backArray();
	for (int i : a) {
		System.out.println(i);
		
		}

	int []b= backArray2();
	for (int j : b) {
		System.out.println(j);
	}
}
}
