/*
5
OOXXOXXOOO
OOXXOOXXOO
OXOXOXOXOXOXOX
OOOOOOOOOO
OOOOXOOOOXOOOOX

*/import java.util.Scanner;

public class ox_exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		String[] arr=new String[num];
		int [] score=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=sc.next();
		}
	
		for(int i=0;i<num;i++) {
			int count = 0;
			for (int j = 0; j <arr[i].length(); j++) {
				
				if (arr[i].charAt(j) == 'O') {
					score[i]+=++count;
					
				} else if (arr[i].charAt(j) == 'X') {
			
					count = 0;
				}
			}
		
		}
		for(int i=0;i<num;i++) {
			System.out.println(score[i]);
		}
		
	}

}
