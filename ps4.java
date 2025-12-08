import java.io.*;
class Main{
	public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inp = br.readLine();
		Integer n = Integer.parseInt(br.readLine());
		System.out.println(UserMainCode.repeatfront(inp,n));
		br.close();
	}
}


class UserMainCode{
	public static String repeatfront(String inp,Integer n){
		int l = inp.length();
		if (l==0){
			return inp;
		}
		else if (l<3){
			String res="";
			for(int i=0;i<n;i++){
				res+=inp;
			}
			return res;
		}
		else{
			String res ="";
			String inp1=inp.substring(0,3);
			for(int i=0;i<n;i++){
				res += inp1;
			}
			return res;
		}
	}
}