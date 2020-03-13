import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    @Test
    public void givenThreeInteger_WhenProper_MethodShouldReturnTrue() {
        Maximum maximum = new Maximum();
        Integer maxInteger[] = {10, 20, 30};
        Assert.assertEquals(maximum.maximumInteger(maxInteger), maxInteger[2]);
    }

    @Test
    public void givenThreeFloatNumber_WhenProper_MethodShouldReturnTrue() {
        Maximum maximum = new Maximum();
        Float maxFloat[] = {10.11f, 12.12f, 13.210f};
        Assert.assertEquals(maximum.maximumFloat(maxFloat), maxFloat[2]);
    }
}
