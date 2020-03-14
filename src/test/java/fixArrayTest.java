import com.tarnovskiy.HW.Lesson06;
import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * @author Tarnovskiy Maksim
 */
@RunWith(value = Parameterized.class)
public class fixArrayTest {
    private static Lesson06 les;
    private static int[] arrayWithout4;


    @BeforeClass
    public static void init(){
        System.out.println("Test 1");
        les = new Lesson06();
        arrayWithout4 = new int[]{1,2,3};
    }
    private int[] x;
    private int[] y;
    public fixArrayTest(int[] x, int[] y){
        this.x = x;
        this.y = y;

    }

    @Parameters
    public static Collection<Object[]> fixTest(){
        return Arrays.asList(new Object[][]{
                {new int[]{4, 4, 2}, new int[]{2}},
                {new int[]{4, 5, 2, 3}, new int[]{5, 2, 3}}
            }
        );
    }
    @Test
    public void fixTestNormal(){
        Assert.assertArrayEquals(les.fixArray(x), y);
    }


    @After
    public void tearDown() {
        les = null;
    }
    Lesson06 arr = new Lesson06();
    @Test(expected = RuntimeException.class)
    public void test1() {
       arr.fixArray(arrayWithout4);
    }





}
