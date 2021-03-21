package chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearchQ7 {

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

        public static final Comparator<PhyscData> VISION_OREDER
                = new VISIONOrderComparator();

        private static class VISIONOrderComparator implements Comparator<PhyscData> {

            public int compare(PhyscData o1, PhyscData o2) {
                return Double.compare(o1.vision, o2.vision);
            }
        }

    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        PhysExamSearchQ7.PhyscData[] x = {
                new PhysExamSearchQ7.PhyscData("이나령", 162, 0.3),
                new PhysExamSearchQ7.PhyscData("유지훈", 168, 1.3),
                new PhysExamSearchQ7.PhyscData("김한결", 171, 0.7),
                new PhysExamSearchQ7.PhyscData("홍준기", 190, 0.8),
                new PhysExamSearchQ7.PhyscData("전서현", 161, 1.2),
                new PhysExamSearchQ7.PhyscData("이호연", 180, 0.1),
                new PhysExamSearchQ7.PhyscData("이수민", 128, 1.7),
        };

        System.out.print("시력이 몇 인 사람을 찾고 있나요? : ");
        double vision = scanner.nextDouble();
        int idx = Arrays.binarySearch(
                x,
                new PhysExamSearchQ7.PhyscData("",168,vision),
                PhyscData.VISION_OREDER
        );

        if(idx<0)
            System.out.println("요소가 없습니다");
        else {
            System.out.println("x[" + idx + "]에 있습니다.");
            System.out.println("찾은 데이터 : " + x[idx]);
        }

    }
}
