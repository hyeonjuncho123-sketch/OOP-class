package Week05;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 몇 개의 정수를 입력받을 것인지 먼저 입력받기
        System.out.print("몇 개의 수 를 입력할 예정인가요? ");
        int count = scanner.nextInt();

        // 입력받은 정수 개수만큼 크기를 가지는 배열 생성
        int[] numbers = new int[count];

        // 추가로 정수들을 입력받아 배열에 저장 (공백으로 구분)
        System.out.print("수를 입력하세요: ");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 최소값과 최대값을 저장할 두 변수의 값은 모두 배열의 0번째 요소의 값으로 초기화
        int min = numbers[0];
        int max = numbers[0];

        // 이후 배열의 요소를 탐색하면서 최소값/최대값 갱신
        for (int i = 1; i < count; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // 결과 출력
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);

        scanner.close();
    }
}