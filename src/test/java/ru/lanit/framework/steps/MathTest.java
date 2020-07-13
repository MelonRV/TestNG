package ru.lanit.framework.steps;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.lanit.testng.Math;

public class MathTest {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Подготовка перед тестами");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Подчищаем после тестов");
    }


    @DataProvider
    public Object[][] testSumAndSub() {
        return new Object[][]{
                {6, 3, 3},
                {0, -2, 2},
                {-9, -5, -4},

        };
    }

    @DataProvider
    public Object[][] testMultiAndDiv() {
        return new Object[][]{
                {9, 3, 3},
                {0, 0, 2},
                {15, -5, -3},
                {-15, 5, -3},
        };
    }

    @DataProvider
    public Object[][] testNegative() {
        return new Object[][]{
                {5, 2, 2},
                {1, -1, 1},
                {100, 4, 4},

        };
    }

    @DataProvider
    public Object[][] testObject() {
        return new Object[][]{
                {"five", 2, 2},
                {1, -1, "one"},
                {100, "four", 4},
                {"seven", "0", -1},
                {3, null, 3}
        };
    }


    @Test(dataProvider = "testSumAndSub")
    public void testEqualsSum(double one, double two, double tree) {
        Assert.assertEquals(one, new Math().sum(two, tree), "Значения не равны!");
    }

    @Test(dataProvider = "testNegative")
    public void testEqualsNegativeSum(double one, double two, double tree) {
        Assert.assertNotEquals(one, new Math().sum(two, tree), "Значения равны!");
    }


    @Test(dataProvider = "testSumAndSub")
    public void testEqualsSub(double one, double two, double tree) {
        Assert.assertEquals(tree, new Math().sub(one, two), "Значения не равны!");
    }

    @Test(dataProvider = "testNegative")
    public void testEqualsNegativeSub(double one, double two, double tree) {
        Assert.assertNotEquals(one, new Math().sub(two, tree), "Значения равны!");

    }
    @Test(dataProvider = "testMultiAndDiv")
    public void testEqualsMulti(double one, double two, double tree) {
        Assert.assertEquals(one, new Math().multi(two,tree), "Значения не равны!");

    }
    @Test(dataProvider = "testMultiAndDiv")
    public void testEqualsDiv(double one, double two, double tree) {
        Assert.assertEquals(two, new Math().div(one, tree), "Значения не равны!");
    }
    @Test(dataProvider = "testNegative")
    public void testEqualsNegativeMulti(double one, double two, double tree) {
        Assert.assertNotEquals(one, new Math().multi(two, tree), "Значения равны!");
    }

    @Test(dataProvider = "testNegative")
    public void testEqualsNegativeDiv(double one, double two, double tree) {
        Assert.assertNotEquals(one, new Math().div(two, tree), "Значения равны!");
    }
}



