import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * created by s.a.miroshnychenko 7/30/2018
 */


public class Mytest4 {

    @Test
    public void testSquareRootOfMinusOneIsNotANumber() {

        int x = 5;
        assertThat(x, is(5));
        assertThat(x, is(not(5)));
    }
}