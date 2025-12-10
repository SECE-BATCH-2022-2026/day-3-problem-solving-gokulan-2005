import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		char ch = sc.next().charAt(0);
		String[] op = UserMainCode.splitString(inp, ch);
        Arrays.stream(op).forEach(x->System.out.println(x));
	}
}
class UserMainCode {
	public static String[] splitString(String inp,char ch){
		String[] parts = inp.split("" + ch);
		String[] op = new String[parts.length];
		int i=0;
		for(String s:parts){
			//StringBuilder sb = new StringBuilder(s);
			//sb = sb.reverse();
			//String s1 = sb.toString();
			//op[i++]=s1.toLowerCase();
			op[i++]=new StringBuilder(s).reverse().toString().toLowerCase();
			
		}
        return parts;
		
	}
}

			