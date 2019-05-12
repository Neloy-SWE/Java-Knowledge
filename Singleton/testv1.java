package Singleton;
import java.util.Scanner;
public class testv1 {
public static void main(String[] args) {
	Scanner a = new Scanner(System.in);
	int b=a.nextInt();
	Sing1v1 y= Sing1v1.get(b);
	y.display();
}
}
