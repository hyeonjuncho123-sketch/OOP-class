package week04;

import java.util.Scanner;

// Student 클래스 정의
class Student {
    private long studentId; // 학번 (숫자로 저장)
    private String name;    // 이름 (문자열)
    private String major;   // 전공 (문자열)
    private long phoneNum;  // 전화번호 (숫자로 저장, 맨 앞 0 및 '-' 제외)

    // getter와 setter 메서드
    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    // 전화번호를 010-xxxx-xxxx 형태로 반환하는 메서드
    public String ltosPhoneNum() {
        // 숫자로 저장된 전화번호를 문자열로 변환 (맨 앞 0이 누락되어 있음)
        String phoneStr = Long.toString(this.phoneNum);

        // (예: 1053559999 -> 010-5355-9999)
            return "0" + phoneStr.substring(0, 2) + "-" + phoneStr.substring(2, 6) + "-" + phoneStr.substring(6, 10);

    }
}

// Homework2 클래스 정의 (메인 클래스)
public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3]; // 3명의 학생 객체를 담을 배열

        // 3명의 학생 정보 입력받기
        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");

            long studentId = scanner.nextLong();
            String name = scanner.next();
            String major = scanner.next();
            long phoneNum = scanner.nextLong();

            // Student 객체 생성 및 setter를 이용한 값 설정
            students[i] = new Student();
            students[i].setStudentId(studentId);
            students[i].setName(name);
            students[i].setMajor(major);
            students[i].setPhoneNum(phoneNum);
        }

        scanner.close();

        // 입력된 학생들의 정보 출력
        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + "번째 학생: " +
                    students[i].getStudentId() + " " +
                    students[i].getName() + " " +
                    students[i].getMajor() + " " +
                    students[i].ltosPhoneNum());
        }
    }
}