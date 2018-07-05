
/*
����
���� ������ ������ �׻� ū ��ĩ�Ÿ����� ���� �־���. �� ������ ���� �������� ������ ���� ������ ���� ū ����� �ɾ���.
���̰� N�� ���� �迭 A�� B�� �ִ�. ������ ���� �Լ� S�� ��������.
S = A[0]*B[0] + ... + A[N-1]*B[N-1]
S�� ���� ���� �۰� ����� ���� A�� ���� ��迭����. ��, B�� �ִ� ���� ��迭�ϸ� �ȵȴ�.
S�� �ּڰ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�

ù° �ٿ� N�� �־�����. ��° �ٿ��� A�� �ִ� N���� ���� ������� �־�����, ��° �ٿ��� B�� �ִ� ���� ������� �־�����. N�� 50���� �۰ų� ���� �ڿ����̰�, A�� B�� �� ���Ҵ� 100���� �۰ų� ���� ���� �ƴ� �����̴�.


���
ù° �ٿ� S�� �ּڰ��� ����Ѵ�.

���� �Է� 1 ���� 
 5
1 1 1 6 0
2 7 8 3 1
*/
import java.util.Arrays;
import java.util.Scanner;
 
public class precious {
 
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        int[] A = new int[n];
        int[] B = new int[n];
 
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
 
        }
        Arrays.sort(A);
        Arrays.sort(B);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i] * B[n - 1 - i];
        }
        System.out.println(sum);
 
    }
}

