import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import org.junit.*;
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
        links.add("some-thing.html");
        assertEquals(links, MarkdownParse.getLinks(content));
    }
    @Test
    public void test2() throws IOException{
        ArrayList<String> links = new ArrayList<>();
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        assertEquals(links, MarkdownParse.getLinks(content));
    }
    @Test
    public void test3() throws IOException{
        ArrayList<String> links = new ArrayList<>();
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        assertEquals(links, MarkdownParse.getLinks(content));
    }
    @Test
    public void test4() throws IOException{
        ArrayList<String> links = new ArrayList<>();
        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);
        links.add("https://something.com");
        assertEquals(links, MarkdownParse.getLinks(content));
    }

    @Test
    public void test5() throws IOException{
        ArrayList<String> links = new ArrayList<>();
        Path fileName = Path.of("test-file5.md");
        String content = Files.readString(fileName);
        assertEquals(links, MarkdownParse.getLinks(content));
    }
}
//comment