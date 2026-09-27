package week04;

import java.util.Scanner;

public class EX_03 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //method overloading

        System.out.print("prime,standard,economy중 한 가지를 입력하시오: ");
        String zone = scanner.next(); // 문자열 입력 next() nextl() 차이 없음..
        scanner.close();
        if (zone.compareTo("prime") == 0) { // prime과 일치하면
            System.out.println("프라임존 표 값은 11000원입니다.");
        }
        else if (zone.compareTo("standard") == 0) { // standard와 일치하면
            System.out.println("스탠다드존 표 값은 10000원입니다.");
        }
        else if (zone.compareTo("economy") == 0) { // economy와 일치하면
            System.out.println("이코노미존 표 값은 9000원입니다.");
        }
        else { // prime, standard, economy가 아니면
            System.out.println("좌석 종류를 잘못 입력했습니다.");
        }
    }
}

