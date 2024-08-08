package class1;

public class ClassStart4 {
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

        Student[] students = new Student[2];    // 2개짜리 배열 만들기
        students[0] = student1;
        students[1] = student2;

        System.out.println("이름: " + students[0].name + " 나이: " + students[0].age + " 성적: " + students[0].grade);
        System.out.println("이름: " + students[1].name + " 나이: " + students[1].age + " 성적: " + students[1].grade);
    }
}
