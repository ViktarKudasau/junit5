import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class HomeTest {

        @BeforeAll
        public static void beforeAll() {
            System.out.println("Before all started");
        }

        @BeforeEach
        public void beforeEach() {
            System.out.println("Before each started");
        }

        @ParameterizedTest
        @ValueSource(strings = {"3","4","5","6"})
        public void testOne(String value) {
            System.out.println("test One started with value " + value);
            String result = MainClass.justExample("1541671");
            Assertions.assertTrue(result.contains(value), "Assert doesn't contain " + value);
            System.out.println("String after replace " + result);
        }

        @RepeatedTest(1)
        public void testTwo() {
            System.out.println("test Two started");
            String result = MainClass.justExample("86");
            Assertions.assertFalse(result.isEmpty(), "Assert is empty");
            System.out.println("String after replace " + result);
        }

        @Test
        public void testThree() {
            System.out.println("test Three started");
            String actual_result = MainClass.justExample("1541671");
            String expected_value = "3543673";
            Assertions.assertEquals(expected_value, actual_result);
            System.out.println("String after replace " + actual_result);
        }

        @AfterEach
        public void afterEach() {
            System.out.println("After each started");
        }

        @AfterAll
        public static void afterAll() {
            System.out.println("After all started");
        }
}
