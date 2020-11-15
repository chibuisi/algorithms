import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCounter {
    Counter counter = new Counter();

    @Test
    public void testIncrement(){
        Assertions.assertEquals(1,counter.increment());
    }

    @Test
    public void testDecrement(){
        Assertions.assertEquals(-1,counter.decrement());
    }
}
