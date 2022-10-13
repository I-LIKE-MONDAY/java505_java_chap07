package chap07;
import java.util.ArrayList;
import java.util.List;


public class ArrayListEx {
    public static void main(String[] args) {
//      뒤의 <String> 는 생략가능.
        ArrayList<String> list = new ArrayList<String>(); // <-- ArrayList  선언방법 1
//      List 클래스가 ArrayList의 부모이므로 부모 타입의 변수에 자식 클래스 타입인
//      ArrayList 객체를 대입하여 사용
//      List<String> list2 = new ArrayList<String>(); // <-- ArrayList  선언방법 2

        // list.size() : 현재 list의 길이
        System.out.println("ArrayList 생성\nlist의 길이 : " + list.size());
        list.add("HTML5");
        list.add("CSS3");
        list.add("Bootstrap5");
        list.add("JS ES6");
        list.add("React");
        list.add("Java");
        list.add("Servlet/JSP");
        list.add("Spring framework");
        list.add("Spring boot");
        list.add("Database(mySql)");
        list.add("Python");

//      일반 배열은 길이가 고정이지만 arrayList는 입력되는 데이터에따라 크기가 변함
        System.out.println("\n데이터 추가 후 arrayList의 길이 확인 : " + list.size());

        String str = list.get(5);
        System.out.println("list의 5번 index의 값 : " + str);

        System.out.println("리스트의 전체 내용 출력");

        for (int i = 0; i < list.size(); i++) {
            System.out.println("리스트" + i + "번 index의 값 : " + list.get(i));
        }

        System.out.println("리스트 안 데이터 삭제하기");

        list.remove(5);
        list.remove(2);
        list.remove("JAVA");

        System.out.println("\nremove 후 list 변수의 크기" + list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println("리스트 " + i + "번 index 값의 : " + list.get(i));
        }


    }

}