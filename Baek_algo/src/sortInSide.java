/*

문제
배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.

입력
첫째 줄에 정렬하고자하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.

출력
 
첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.

입력 1 복사 
 2143

예제 출력 1 복사 
 4321
*/
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class sortInSide {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String num=sc.next();
		String[] number=new String[num.length()];
		for(int i=0;i<num.length();i++) {
			number[i]=num.charAt(i)+"";
		}
		Arrays.sort(number);
		
		for(int i=number.length-1;i>=0;i--) {
			System.out.print(number[i]);
		}
		}
	
}
