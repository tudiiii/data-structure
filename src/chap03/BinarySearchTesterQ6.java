package chap03;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTesterQ6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = scanner.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0] : ");
        x[0] = scanner.nextInt();

        for(int i=1;i<num;i++){
            do {
                System.out.print("x[" + i + "] : ");
                x[i] = scanner.nextInt();
            }while(x[i]<x[i-1]);
        }

        System.out.print("검색할 값: ");
        int ky = scanner.nextInt();

        int idx = Arrays.binarySearch(x, ky);

        if(idx <0)
            System.out.println("그 값의 요소의 삽입 포인트는 x[" + (-idx-1) + "] 입니다.");
        else
            System.out.println(ky+"은(는) x[" + idx + "]에 있습니다.");
    }
}
