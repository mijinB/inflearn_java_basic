package class1;

public class ClassStart5 {
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

        // Student[] students = new Student[]{student1, student2};  아래와 동일
        Student[] students = {student1, student2};    // 생성과 선언을 동시에 하는 것

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름: " + students[i].name + " 나이: " + students[i].age + " 성적: " + students[i].grade);
        }
        // ∣∣ 동일
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
        // ∣∣ 동일    /   iter 단축입력 사용 가능
        for (Student s : students) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }
}
