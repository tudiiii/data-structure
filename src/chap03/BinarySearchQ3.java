package chap03;

import java.util.Scanner;

public class BinarySearchQ3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = scanner.nextInt();
        int[] x = new int[num];
        int[] y = new int[num];

        System.out.println("숫자를 입력하세요. ");

        for(int i=0;i<num;i++){
            System.out.print("x[" + i + "] : " );
            x[i] = scanner.nextInt();
        }

        System.out.print("찾을 숫자를 입력하세요 : ");
        int ky = scanner.nextInt();

        int count = searchIdx(x, num, ky, y);

        if (count == 0)
            System.out.println("그 값의 요소가 없습니다.");
        else
            for (int i = 0; i < count; i++)
                System.out.println("그 값은 " + "x[" + y[i] + "]에 있습니다.");

    }

    static int searchIdx(int[] a, int n, int key, int[] idx){
        int count = 0;

        for(int i=0 ; i<n ; i++){
            if(a[i] == key){
                idx[count++] = i;
            }
        }
        return count;
    }
}
