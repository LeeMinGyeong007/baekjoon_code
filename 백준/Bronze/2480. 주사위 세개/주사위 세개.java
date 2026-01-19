import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int award;
		if (A == B && B == C) {
		    award = 10000 + A * 1000;
		} else if (A == B || A == C) {
		    
		    award = 1000 + A * 100;
		} else if (B == C) {
		   
		    award = 1000 + B * 100;
		} else {
		  
		    int max = Math.max(A, Math.max(B, C));
		    award = max * 100;
		   
		}
		 System.out.println(award);
		 }
}
