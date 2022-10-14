import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("JAVA");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("JAVA");    // HashSet 에서는 중복 데이터 입력되면 자동 제거됨
        set.add("Mybatis");

        int size = set.size();
        System.out.println("HashSet에 저장된 수 : " + size); // 5개 add 했지만 중복데이터 JAVA 1개 삭제됨

        Iterator<String> iterator = set.iterator();
        // iterator.hasNext() 사용하면 리소스/배열/set/map 어디에 적용하든 사용방법 동일하다는 장점이 있다.
        while (iterator.hasNext()) {    // hasNext() : 순서 없음 -> 반복문 사용 불가능. iterator 타입으로 만든 후 hasNext()로 하나씩 끄집어내는것.
            // 더 이상 출력할 것이 없으면 false.
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        // for (String item : set) <- 이런 형식으로 for문 사용도 가능

        set.remove("JDBC");
        set.remove("Mybatis");

        System.out.println("HashSet에 저장된 수 : " + set.size());

        iterator = set.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        set.clear();
        if (set.isEmpty()) {    // isEmpty 로 내부 데이터 비어있는지 확인
            System.out.println("HashSet이 비어있음.");
        }
    }
}
