import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.*;

// 테스트 클래스 이름 만드는 표준 방법
// : 테스트 대상 클래스(타깃 클래스) 이름에 Test를 붙여서 만든다.
// 테스트 클래스에 테스트 메서드가 아닌 다른 메서드도 포함 가능
// 테스트 메서드가 아닌 다른 메서드가 포함되어 있을 시, JUnit이 알아서 제외함
public class ScoreCollectionTest {

    @Test
    public void answersArithmeticMeanOfTwoNumbers()  {
        // 준비
        // ScoreCollection 인스턴스를 생성,
        // Scoreable 구현 객체로 add() 메서드를 두 번 호출
        ScoreCollection collection = new ScoreCollection();
        // Scoreable 인스턴스에서 원하는 값을 반환
        collection.add(() -> 5);
        collection.add(() -> 7);

        // 실행
        int actualResult = collection.arithmeticMean();

        // 단언
        // assertThat: 실제 결과와 matcher 객체를 인자로 받는다.
        // equalTo 매처는 실제 값과 기대되는 값인 6을 비교한다.
        assertThat(actualResult, equalTo(6));
    }
}