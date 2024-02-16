import org.junit.Test;

import java.time.DateTimeException;
import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void testData(){
        String dataString = "2023-03-01T13:00:00Z";
       OffsetDateTime dateTime = Main.parseDate(dataString);
       OffsetDateTime aspettazione = OffsetDateTime.parse(dataString);
       assertEquals(aspettazione,dateTime);
    }
    @Test
    public void testInvalidate(){
        String invalidate = "Charmander";
        assertThrows(DateTimeException.class,()-> Main.parseDate(invalidate));
    }

}