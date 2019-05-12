package Enum;

public class enum1v1 {
	enum day{
		SAT, SUN, MON, TUE, WED, THS, FRI
	}
public static void main(String[] args) {
	for(day s : day.values()){
		System.out.println(s);
	}
}
}
