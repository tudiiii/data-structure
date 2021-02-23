package chap03;

import java.util.Scanner;

// 선형 검색
public class SeqSearch {
    static int seqSearch(int[] a, int n, int key){
        int i=0;

        while(true){
            if(i==n) return -1;
            if(a[i]==key) return i;
            i++;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = scanner.nextInt();
        int[] x = new int[num];

        for(int i=0;i<num;i++){
            System.out.print("x[" + i +"] : ");
            x[i] = scanner.nextInt();
        }

        System.out.print("검색할 값 : ");
        int ky = scanner.nextInt();

        int idx = seqSearch(x, num, ky);

        if(idx == -1){
            System.out.println("그런 요소가 없습니다.");
        }else {
            System.out.println(ky+"는 x[" + idx + "]에 있습니다.");
        }
    }
}
