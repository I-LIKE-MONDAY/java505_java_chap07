import java.lang.reflect.Member;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx2 {
    public static void main(String[] args) {
//        문제 1) HashSet 을 사용하여 로또 번호 7개를 생성하는 프로그램을 작성하세요.
        Set<Integer> lotto = new HashSet<>();
        int count = 0;

        while (count < 7) {
            int rnd = (int)(Math.random() * 45) + 1;

            if (lotto.add(rnd)) {
                count++;

                if (lotto.size() == 7) {
                    break;
                }
            }
        }

        int rnd = (int)(Math.random() * 45) + 1;

        Iterator<Integer> iter = lotto.iterator();
        String number = "";
        while (iter.hasNext()) {
            int num = iter.next();
            number += String.valueOf(num) + " ";
        }
        System.out.println(number);

        System.out.println("\n\n");

//       예제
        Set<Member> set = new HashSet<>();

        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));

//        아래 코드 실행 결과 : 2.
//        중복인데 2개 인 이유 ? new 키워드를 쓰면 객체 생성 -> 주소값이 다름. 같아보이지만 주소값 다르면 다른 데이터로 인식
        System.out.println("총 객체 수 : " + set.size());
//        Member 클래스에서 equals(), hashCode() 오버라이드 추가 하면 결과값 1로 변함.
//        Why?
//        동일 객체임을 판단하는 기준이 equals(), hashCode() 이기 때문.

    }
}

