import java.util.*;
import java.io.*;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int c=usermaincode.countocc(s1,s2);
		System.out.println(c);
	}
}
class usermaincode{
	public static int countocc(String s1,String s2){
		int count = 0;
    	int l1 = s1.length();
    	int l2 = s2.length();
    	for (int i = 0; i <= l1 - l2; i++) {
        	int match = 0;
        	for (int j = 0; j < l2; j++) {
            	if (s1.charAt(i + j) == s2.charAt(j)) {
                	match++;
            	}
            	else{
            		break;
            	} 
        	}
        	if (match == l2) {
            	count++;
            	
        	}
    	}
    	return count;
}
}
