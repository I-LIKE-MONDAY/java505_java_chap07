import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        System.out.println("HashMap 의 크기 : " + map.size()); // 결과 : 0

        map.put("아이유", 30);
        map.put("유인나", 32);
        map.put("유재석", 50);
        map.put("홍길동", 30);
        map.put("이순신", 40);

        System.out.println("HashMap 의 크기 : " + map.size()); // 결과 : 5

//        찾기
//        map.get(키) : 해당 키가 가지고 있는 값 출력
        System.out.println("\t홍길동 : " + map.get("홍길동"));
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> keyIter = keySet.iterator();   // 키를 모두 가져와서 iterator에 집어넣기

        while (keyIter.hasNext()) {
            String key = keyIter.next();    // 해당 key에 깃발 꽂기
            int value = map.get(key);   // get(key)로 키값에 맞는 값 가져오기
            System.out.println("key : " + key + " \tvalue : " + value);
        }
        System.out.println();

//        삭제
        if (map.containsKey("김종국")) {   // 김종국이라는 키가 있으면
            map.remove("김종국");     // 유재석이라는 키 삭제, 없으면 삭제 안함
        }

//        삭제
        map.remove("이순신");
        map.remove("홍길동");
        System.out.println("HashMap의 크기 : " + map.size());

        map.clear();
        System.out.println("HashMap의 크기 : " + map.size());


    }
}
