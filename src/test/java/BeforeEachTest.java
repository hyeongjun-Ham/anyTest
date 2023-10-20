import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class BeforeEachTest {

    @BeforeEach
    void setUp() {
        System.out.println("OutBefore");
    }

    @AfterEach
    void afterEach() {
        System.out.println("OutAfter");
    }


    @Nested
    class BeforeTest{

        @BeforeEach
        void setUp() {
            System.out.println("InnerBefore");
        }

        @AfterEach
        void afterEach() {
            System.out.println("InnerAfter");
        }

        @Test
        void test() {
            System.out.println("Test");
        }

    }
}
