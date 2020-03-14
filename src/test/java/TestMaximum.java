import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    @Test
    public void givenThreeInteger_WhenProper_MethodShouldReturnMaximum() {
        Maximum maximum = new Maximum();
        Integer maxInteger[] = {10, 20, 30};
        Assert.assertEquals(maximum.maximum(maxInteger), maxInteger[2]);
    }

    @Test
    public void givenThreeFloatNumber_WhenProper_MethodShouldReturnMaximum() {
        Maximum maximum = new Maximum();
        Float maxFloat[] = {10.11f, 12.12f, 13.210f};
        Assert.assertEquals(maximum.maximum(maxFloat), maxFloat[2]);
    }

    @Test
    public void givenThreeString_WhenProper_MethodShouldReturnMaximum() {
        Maximum maximum = new Maximum();
        String maxString[] = {"ram", "abhi", "virat"};
        Assert.assertEquals(maximum.maximum(maxString), maxString[2]);
    }
}
