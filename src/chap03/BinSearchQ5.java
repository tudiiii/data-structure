package chap03;

import java.util.Scanner;

public class BinSearchQ5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = scanner.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0] : ");
        x[0] = scanner.nextInt();

        for(int i=1;i<num;i++){
            System.out.print("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }

        System.out.print("검색할 값: ");
        int ky = scanner.nextInt();

        int idx = binSearchX(x, num, ky);

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(ky + "은 x[" + idx + "]에 있습니다.");
    }

    static int binSearchX(int[] a, int n, int key){
        int pl = 0;
        int pr = n-1;

        while(pl <= pr){

            int pc = (pl + pr) / 2;
            if(a[pc] == key){
                for (; pc > pl; pc--)
                    if (a[pc - 1] < key)
                        break;
                return pc;
            }else if(a[pc] > key){
                pr = pc - 1;
            }else {
                pl = pc + 1;
            }

        }
        return -1;
    }
}
