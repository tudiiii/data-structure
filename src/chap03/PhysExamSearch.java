package chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class PhysExamSearch {

    static class PhyscData {
        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision){
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        @Override
        public String toString() {
            return "PhyscData{" +
                    "name='" + name + '\'' +
                    ", height=" + height +
                    ", vision=" + vision +
                    '}';
        }

        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData> {
            public int compare(PhyscData d1, PhyscData d2){
                return (d1.height>d2.height) ? 1 : (d1.height<d2.height) ? -1 : 0;
            }

        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("이나령", 162, 0.3),
                new PhyscData("유지훈", 168, 1.3),
                new PhyscData("김한결", 171, 0.7),
                new PhyscData("홍준기", 190, 0.8),
                new PhyscData("전서현", 161, 1.2),
                new PhyscData("이호연", 180, 0.1),
                new PhyscData("이수민", 128, 1.7),
        };

        System.out.print("몇 cm인 사람을 찾고 있나요? : ");
        int height = scanner.nextInt();
        int idx = Arrays.binarySearch(
                x,
                new PhyscData("",height,0.0),
                PhyscData.HEIGHT_ORDER
        );

        if(idx<0)
            System.out.println("요소가 없습니다");
        else {
            System.out.println("x[" + idx + "]에 있습니다.");
            System.out.println("찾은 데이터 : " + x[idx]);
        }

    }
}
