package Tests.day3;

import Tests.AbstractTest;
import day3.Task3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Day3Task3Test extends AbstractTest {
    @Test
    public void ShouldWorkProperly() {
        setInput("4 2\r\n100 0\r\n13 10\r\n5 2\r\n0 0\r\n");
        Task3.main(new String[0]);
        assertEquals("2.0\r\nДеление на 0\r\n1.3\r\n2.5\r\nДеление на 0\r\n", getOutput(), "4 2     13 10     5 2     0 0");
    }

}
