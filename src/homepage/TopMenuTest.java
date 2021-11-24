package homepage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TopMenuTest extends Utility{
    @Before
    public void setUp(){

        openBrowser();

    }
    @Test
    public void verifyPageNavigation()
    {
        selectMenu("Digital downloads");
        //select menu method is used to take any element like Computers,Books,Jewelry,Gift Cards and so on
    }
   @After
   public void tearBrowser(){
        closeBrowser();
   }
    }





