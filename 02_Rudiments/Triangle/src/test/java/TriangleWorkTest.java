import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by matthewmartin on 1/27/17.
 */


public class TriangleWorkTest {
    TriangleWork triWork;

    @Before
    public void setup() {
        triWork = new TriangleWork();
    }

    @Test
    public void triangleWorkTest() {
        String expected = "*****\n****\n***\n**\n*\n";
        System.out.println(expected);
        String actual = triWork.triangleBuilder();
        assertEquals("I expect five lines of decending line of stars to be printed",expected,actual);

    }
}

