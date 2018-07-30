import org.junit.*;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.core.CombinableMatcher.both;
import static org.junit.Assert.*;

/**
 * created by s.a.miroshnychenko 7/30/2018
 */

public class MyTest {

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
        byte[] bytes= "text".getBytes();
        byte[] bytes1= "text".getBytes();
        /*assertEquals("array different","text", "text");*/
        assertThat("text", both(containsString("t")).and(containsString("x")));


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

    @Override
    public String toString() {
        return "MyTest{}";
    }
}
