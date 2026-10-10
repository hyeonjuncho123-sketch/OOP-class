package Week06;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 두 수를 입력받음
        System.out.print("두 개의 정수를 입력하세요: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        // 재귀호출 함수 실행 및 결과 출력
        int resultRecursive = gcd(num1, num2);
        System.out.println("최대공약수 (재귀호출): " + resultRecursive);
        
        // 반복문 함수 실행 및 결과 출력 (결과가 동일한지 확인)
        int resultLoop = gcdLoop(num1, num2);
        System.out.println("최대공약수 (반복문): " + resultLoop);
        
        scanner.close();
    }

    // 1. 알고리즘 (재귀호출)
    public static int gcd(int m, int n) {
        // n이 0이라면 m을 반환하고 함수 실행 종료
        if (n == 0) {
            return m;
        }
        
        // 두 수 중 큰 수와 작은 수를 판별(class Math 의 메서드 max, min을 사용)
        int max = Math.max(m, n);
        int min = Math.min(m, n);
        
        // 첫번째 인자로 작은 수를, 두번째 인자로 큰 수를 작은 수로 나눈 나머지를 전달하여 재귀호출
        return gcd(min, max % min);
    }

    // 2. 알고리즘 (반복문으로 변경)
    public static int gcdLoop(int m, int n) {
        // 초기 조건 처리
        if (n == 0) {
            return m;
        }
        
        int max = Math.max(m, n);
        int min = Math.min(m, n);
        
        // 재귀호출 대신 while 반복문을 사용하여 나머지 연산 수행
        while (min != 0) {
            int remainder = max % min;
            max = min;
            min = remainder;
        }
        
        return max;
    }
}