import junit.framework.TestCase;
import org.junit.*;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.core.CombinableMatcher.*;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * created by s.a.miroshnychenko 7/30/2018
 */


public class Mytest3 {

    @Test
    public void testEquals() {
        String theBiscuit = new String("Ginger");
        String myBiscuit = new String("Ginger");
        assertThat(theBiscuit, equalTo(myBiscuit));




    }
}