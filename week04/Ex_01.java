//package week04;
//
//class Student {
//    String name;
//    double gpa;
//    int income;
//
//    void setter(String name, double gpa, int income) {
//        this.name = name;
//        this.gpa = gpa;
//        this.income = income;
//    }
//
//    void getter() {
//        System.out.println("Name : " + name + "Gpa : " + gpa + "income : " + income);
//    }
//}
//public class Ex_01 {
//    static void main(String[] args) {
//        Student s1 = new Student();
//        Student s2 = new Student();
//        Student s3 = new Student();
//
//        s1.setter("김규상", 4.1, 3);
//        s2.setter("김민재", 3.71, 5);
//        s3.setter("김용하", 3.93, 7);
//
//        if(s1.gpa >= 3.5)
//            if(s1.income <= 5) {
//                System.out.println(s1.name + "장학생으로 선정되었습니다.");
//            }else  {
//                System.out.println(s1.name + "장학생으로 선정되지 않았습니다.");
//            }
//
//
//        if(s2.gpa >= 3.5)
//            if(s2.income <= 5)
//                System.out.println(s2.name + "장학생으로 선정되었습니다.");
//            else  {
//                System.out.println(s2.name + "장학생으로 선정되지 않았습니다.");
//            }
//
//        if(s3.gpa >= 3.5)
//            if(s3.income <= 5)
//                System.out.println(s3.name + "장학생으로 선정되었습니다.");
//            else  {
//                System.out.println(s3.name + "장학생으로 선정되지 않았습니다.");
//            }
//    }
//}
