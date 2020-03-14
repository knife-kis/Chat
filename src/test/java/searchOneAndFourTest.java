import com.tarnovskiy.HW.Lesson06;
import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * @author Tarnovskiy Maksim
 */
@RunWith(value = Parameterized.class)
public class searchOneAndFourTest {
    private static Lesson06 les;
    private int[] x;
    private boolean b;

    public searchOneAndFourTest(int[] x, boolean b) {
        this.x = x;
        this.b = b;
    }

    @BeforeClass
    public static void init(){
        les = new Lesson06();
    }

    @Parameters
    public static Collection<Object[]> fixTest(){
        return Arrays.asList(new Object[][]{
                        {new int[]{4, 4, 1}, true},
                        {new int[]{4, 5, 2, 3}, false},
                {new int[]{1,2,3,4,5}, true},
                {new int[]{}, false}
                }
        );
    }

    @Test
    public void fixTestNormal(){
        Assert.assertEquals(les.searchOneAndFour(x), b);
    }

    @After
    public void close(){
        les = null;
    }
}
