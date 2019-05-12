package Enum;

 enum season {
SUMMER(10), WINTER(30);
int a;
season (int x){
	a=x;
}
}
public class enum1v2{
	public static void main(String[] args) {
		for(season n : season.values()){
			System.out.println(n+" "+n.a);
		}
	}
}