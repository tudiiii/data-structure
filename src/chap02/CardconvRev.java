package chap02;

import java.util.Arrays;

// 입력받은 10진수를 2진수로 기수 변환하여 나타냄
public class CardconvRev {
    static int cardConvR(int x, int r, char[] d){
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
            d[digits++] = dchar.charAt(x % r);
            x /=r ;
        }while(x != 0);

        return digits;
    }

    public static void main(String[] args){
        int x = 59; int r = 16;
        char[] d = new char[x/r];
        cardConvR(x, r, d);

        System.out.println(x + "를 " + r + "진수로 바꾼 값은 " + Arrays.toString(d));

    }
}
