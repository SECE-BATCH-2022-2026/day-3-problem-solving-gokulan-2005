import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		System.out.println(UserMainCode.matchPattern(inp));
	}
}

class UserMainCode{
	public static boolean matchPattern (String inp){
		return inp.matches("CPT-\\d{6}");
		
	}
}