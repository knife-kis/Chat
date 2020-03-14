import com.tarnovskiy.HW.Lesson06;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Tarnovskiy Maksim
 */
public class MethodTest {
    private static Lesson06 les;


    @Before
    public void init() {
        System.out.println("init Method");
        les = new Lesson06();
    }

    @Test(expected = RuntimeException.class)
    public void test1() {
        les.fixArray(new int[]{1, 5, 5, 6});
    }
}
