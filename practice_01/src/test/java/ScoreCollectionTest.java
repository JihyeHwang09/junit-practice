import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

// 테스트 클래스 이름 만드는 표준 방법
// : 테스트 대상 클래스(타깃 클래스) 이름에 Test를 붙여서 만든다.
// 테스트 클래스에 테스트 메서드가 아닌 다른 메서드도 포함 가능
// 테스트 메서드가 아닌 다른 메서드가 포함되어 있을 시, JUnit이 알아서 제외함
public class ScoreCollectionTest {
    //  @Test : JUnit은 @Test 애너테이션이 붙은 test 메서드를 테스트로 실행
    // JUnit은 테스트 클래스에 test라는 단일 테스트 메서드를 생성
    // test라는 메서드 이름은 언제든지 의미있는 이름으로 변경 가능
    @Test
    public void test () {
//      fail("Not yet implemented");
//        : fail 메서드로 인해 테스트 실패
//        그 지점에서 Unit은 Not yet implemented라는 정보를 알려 주는 실패 메시지를 표시
    }

//    @Test
//    void add() {
//    }
//
//    @Test
//    void arithmeticMean() {
//    }
}