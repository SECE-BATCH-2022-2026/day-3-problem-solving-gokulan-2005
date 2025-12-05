import java.util.*;
import java.io.*;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int r = usermaincode.calculatesum(a,b,c);
		System.out.println(r);
	}
}
class usermaincode{
	public static Integer calculatesum(Integer a,Integer b,Integer c){
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