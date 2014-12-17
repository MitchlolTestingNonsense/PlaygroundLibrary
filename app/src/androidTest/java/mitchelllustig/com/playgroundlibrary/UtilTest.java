package mitchelllustig.com.playgroundlibrary;

import junit.framework.TestCase;

/**
 * Created by Mitch on 12/16/2014.
 */
public class UtilTest extends TestCase{

    public void testAdd(){
        assertEquals(5, Util.add(2,3));
    }

}
