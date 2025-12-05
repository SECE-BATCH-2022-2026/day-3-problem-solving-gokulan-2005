import java.util.*;
import java.io.*;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int r = UserMainCode.calculateSum(a,b,c);
		System.out.println(r);
	}
}
class UserMainCode{
	public static Integer calculateSum(Integer a,Integer b,Integer c){
		if (a==13 && b==13 && c==13){
			return 0;
		}
		else if (a == 13){
			if (c==13){
				return 0;
			}
			else{
				return c;
			}	
		}
		else if (b==13){
			return a;
		}
		else if(c==13){
			return a+b;
		}
		else{
			return a+b+c;
		}
	}
}