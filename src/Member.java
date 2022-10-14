public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //    Object 타입 : 자바의 최상위 클래스
    @Override
    public boolean equals(Object obj) { // 다형성.
        if (obj instanceof Member) {    // true 라면
            Member member = (Member) obj;   // obj를 멤버 클래스 타입으로 변환해서 집어넣음
            return member.name.equals(this.name) && (member.age == age); // member.name(매개변수로 넘어온)과 this.name이 동일하고
            // 매개변수로 넘어온 age와 현재 객체 내의 age가 같으면 true 리턴.
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}
