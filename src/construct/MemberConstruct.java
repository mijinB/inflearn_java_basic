package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자 추가 (오버로딩)
    MemberConstruct(String name, int age) {
        // this.name = name; 같은 문장이 반복되니까 아래처럼 줄여서 사용할 수 있다.
        this(name, age, 50);
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
