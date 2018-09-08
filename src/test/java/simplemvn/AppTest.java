package simplemvn;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {
	@Test
		   public void testApp() {
		      App appObject = new App();
	
		      Assert.assertEquals(appObject.reverseString("Test!"), "!tseT");
		   }
	
	@Test
	   public void testAppone() {
	      App appObject = new App();

	      Assert.assertEquals(appObject.reverseString("test!"), "!tset");
	   }
}
