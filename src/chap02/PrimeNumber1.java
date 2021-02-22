package chap02;

// 1,000 이하의 소수를 열거 (버전1)
public class PrimeNumber1 {
    public static void main(String[] args){
        int count = 0;

        for(int n=2;n<=1000;n++){
            int i;
            for(i=2;i<n;i++){
                count++;
                if(n%i==0) break;
            }

            if(n==i) System.out.println(n);
        }

        System.out.println("나눗셈을 수행한 횟수 : " + count);
    }
}
