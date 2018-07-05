import java.util.Scanner;

public class maxWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String sentence=sc.next();
		
		sentence=sentence.toUpperCase();
		int size='Z';
		int[] num=new int[size+1];
	for(int i=0;i<sentence.length();i++) {
		num[sentence.charAt(i)]++;
	}
	int max=0;
	String mWord="";
	for(int i='A';i<num.length;i++) {
		

		if(max<num[i])
		{	max=num[i];
		    mWord=(char)i+"";
		  

		}
		else if(max==num[i]&&max!=0) {
            mWord="?";	
          
		}
	}
		System.out.println(mWord);
     
	}

}
