import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;


public class FirstTest {

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

    @Disabled
    @Test
    public void testThree() {
        System.out.println("test Three started");
        String result = MainClass.justExample("1541671");
        String value = "3543673";
        Assertions.assertTrue(result.equalsIgnoreCase(value), "Expected result is " + result);
        System.out.println("String after replace " + result);

    }

    @Disabled
    @ParameterizedTest
    @ValueSource(strings = {"1","2","3","4"})
    public void testFour(int value) {

        System.out.println("test Four started with value " + value);
    }

    @Disabled
    @ParameterizedTest
    @EnumSource(Directions.class)
    public void testFive(Directions value) {

        System.out.println("test Five started with value " + value.name());
    }

    @Disabled
    @ParameterizedTest
    @CsvSource({
            "alex, qa, 30, works",
            "john, aqa, 35, works",
            "britney, manager, 37, sleeps"
    })
    public void testSix(String name, String profession, int age, String activity) {

        Worker worker = new Worker(name, profession, age, activity);
        System.out.println("test Six started with value " + worker.toString());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "worker.csv", numLinesToSkip = 1)
    public void testSeven(String name, String profession, int age, String activity) {

        Worker worker = new Worker(name, profession, age, activity);
        System.out.println("test Seven started with value " + worker.toString());
    }

    @Disabled
    @Test
    public void testEight() {

        int []  array_A = {1,2,3,4,5,6,7,8,9,10};
        int []  array_B = {1,2,3,4,5,6,7,8,9,10};
        Assertions.assertArrayEquals(array_A, array_B, "Arrays NOT Equals!");
        System.out.println("test Eight started. Array_A Equals array_B ");
    }

    @Test
    public void testNine() {

        Assertions.assertThrows(NumberFormatException.class, () -> MainClass.justExample("1235"));

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
