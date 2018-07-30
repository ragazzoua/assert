import org.junit.*;

/**
 * created by s.a.miroshnychenko 7/30/2018
 */

public class MyTest2 {

    @Before
    public void setUp() throws Exception {
        System.out.println("Before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }
    @Test
    public void test2() {
        System.out.println("test2");
    }
    @Test
    public void test3() {
        System.out.println("test3");
    }
    @BeforeClass
    public static void setUps() throws Exception {
        System.out.println("Beforeclass");
    }

    @AfterClass
    public static void tearDowns() throws Exception {
        System.out.println("afterclass");
    }

}
