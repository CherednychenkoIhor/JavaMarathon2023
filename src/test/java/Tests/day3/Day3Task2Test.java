package Tests.day3;

import Tests.AbstractTest;
import day3.Task2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Day3Task2Test extends AbstractTest {
    @Test
    public void ShouldWorkProperly() {
        setInput("1 2\r\n15 3\r\n3 0\r\n");
        Task2.main(new String[0]);
        assertEquals("0.5\r\n5.0\r\n", getOutput(), "1 2     15 3     3 0");
    }

}
