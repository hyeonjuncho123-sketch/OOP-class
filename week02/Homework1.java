package week02;

import java.util.Scanner;

public class Homework1 {
    static void main(String[] args) {
        int n01, n02, n03, n04, n05;
        System.out.println("정수를 입력하세요: ");
        Scanner in = new Scanner(System.in);
        n01 = in.nextInt();
        System.out.println("현재까지 입력된 정수의 합은" + n01 + "입니다.");

        System.out.println("정수를 입력하세요: ");
        n02 = in.nextInt();
        System.out.println("현재까지 입력된 정수의 합은" + (n01+n02) + "입니다.");

        System.out.println("정수를 입력하세요: ");
        n03 = in.nextInt();
        System.out.println("현재까지 입력된 정수의 합은" + (n01+n02+n03) + "입니다.");

        System.out.println("정수를 입력하세요: ");
        n04 = in.nextInt();
        System.out.println("현재까지 입력된 정수의 합은" + (n01+n02+n03+n04) + "입니다.");

        System.out.println("정수를 입력하세요: ");
        n05 = in.nextInt();
        System.out.println("현재까지 입력된 정수의 합은" + (n01+n02+n03+n04+n05) + "입니다.");
        in.close();


    }
}
