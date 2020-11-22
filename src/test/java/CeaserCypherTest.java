import org.junit.*;
import static org.junit.Assert.*;

public class CeaserCypherTest {
    @Test
    public void cypher_checkValueOfKey_String(){
        CeaserCypher testCeaserCypher = new CeaserCypher();
        String expectedOutput = "The key must between 1 and 25";
        assertEquals(expectedOutput, testCeaserCypher.cypher("Encrypt", 27));
    }
    @Test
    public void cypher_checkBothStringAndKey_String(){
        CeaserCypher testCeaserCypher = new CeaserCypher();
        String expectedOutput = "Enter letters only, and the key must between 1 and 25";
        assertEquals(expectedOutput, testCeaserCypher.cypher("Encrypt234", 27));
    }

}