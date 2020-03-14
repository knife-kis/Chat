package ru.geekbrains.lesson6.testing;

/**
 * @author Tarnovskiy Maksim
 */
public class TestCase {
    @BeforeSuite
    public void methodBefore() {
        System.out.println("TestCase.methodBefore");
    }
    @AfterSuite
    public void methodAfter() {
        System.out.println("TestCase.methodAfter");
    }

    @Test(priority = 1)
    public void methodTest1() {
        System.out.println("methodTest1 priority 1");
    }

    @Test(priority = 8)
    public void methodTest2() {
        System.out.println("methodTest2 priority 8");
    }

    @Test(priority = 3)
    public void methodTest3() {
        System.out.println("methodTest3 priority 2");
    }
}
