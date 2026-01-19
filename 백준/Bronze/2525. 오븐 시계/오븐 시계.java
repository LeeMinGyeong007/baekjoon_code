import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int totalMinutes = (A * 60) + B + C;
		int finalHour = totalMinutes / 60;
		int finalMinute = totalMinutes % 60;
		finalHour = finalHour % 24;
		System.out.println(finalHour + " " + finalMinute);
		
	}
	

}
