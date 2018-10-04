import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

	public void testAllElements() {
	    String h = "<div><p>Hello</p><p><b>there</b></p></div>";
	    Document doc = Jsoup.parse(h);
	    Elements allDoc = doc.select("*");
	    Elements allUnderDiv = doc.select("div *");
	    assertEquals(8, allDoc.size());
	    assertEquals(3, allUnderDiv.size());
	    assertEquals("p", allUnderDiv.first().tagName());
	}
}
