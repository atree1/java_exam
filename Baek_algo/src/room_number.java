import java.util.Scanner;

/*다솜이는 은진이의 옆집에 새로 이사왔다. 
 * 다솜이는 자기 방 번호를 예쁜 플라스틱 숫자로 문에 붙이려고 한다.
다솜이의 옆집에서는 플라스틱 숫자를 한 세트로 판다.
 한 세트에는 0번부터 9번까지 숫자가 하나씩 들어있다. 
 다솜이의 방 번호가 주어졌을 때, 
 필요한 세트의 개수의 최소값을 출력하시오. 
 (6은 9를 뒤집어서 이용할 수 있고, 9는 6을 뒤집어서 이용할 수 있다.)
*/
public class room_number {

	public static void main(String[] args) {
        
		int[] p_num=new int[10];
		Scanner sc=new Scanner(System.in);
		String dnum=sc.next();
		int max=0;
		for(int i=0;i<dnum.length();i++)
		{
			int num=dnum.charAt(i)-'0';
			
					p_num[num]++;
		}
		   int k=(p_num[6]+p_num[9])/2+(p_num[6]+p_num[9])%2;
		   p_num[6]=k;
		   p_num[9]=k;
	        for(int i=0;i<p_num.length;i++)
	        {
	        	max=Math.max(p_num[i], max);
	        	
	        }
	        System.out.println(max);
	}
}
