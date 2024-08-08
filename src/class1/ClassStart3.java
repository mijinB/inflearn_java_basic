package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        // 클래스 사용
        Student student1;           // 변수 생성
        student1 = new Student();   // 인스턴스 생성 / 참조값(주소)를 반환해줘서 변수에 대입된다.
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " + student2.grade);
    }
}
