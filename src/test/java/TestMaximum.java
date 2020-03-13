import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    @Test
    public void givenThreeInteger_WhenProper_MethodShouldReturnTrue() {
        Maximum maximum = new Maximum();
        Integer maxInteger[] = {10, 20, 30};
        Assert.assertEquals(maximum.maximumInteger(maxInteger), maxInteger[2]);
    }
}
