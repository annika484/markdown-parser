import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void test1() throws IOException{
        ArrayList<String> links = new ArrayList<>();
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        links.add("https://something.com");
        links.add("some-page.html");
        assertEquals(links, MarkdownParse.getLinks(content));
    }
}