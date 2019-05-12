package Enum;
 enum season2{
	SUMMER(10){
		void xxx(){
			System.out.println("this is summer season");
		}
	};
	/* 
	 * eikhane jodi method override eker odhik consant thake tahole
	 *  koma (,) use korte hobe ar ses er constant er bracket er por 
	 *  (;) kolon use korte hobe. ar jodi kono abstract method er 
	 *  jhamela na thake tahole kolon dewa na dewa same.
	 */
	int a;
	season2(int x){
		a=x;
	}
	 abstract void xxx();
	 
	 /*
	  * enum e jodi abstract method declare kora hoi tobe sei method ke 
	  * constant er vetor override korte hoi 
	  */
}
public class enum1v3 {
public static void main(String[] args) {
	for (season2 s : season2.values()){
		System.out.println(s+" "+s.a);
		s.xxx();
	}
	
}
}
