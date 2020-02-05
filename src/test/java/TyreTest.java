import componenets.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    Tyre tyre;


    @Before
    public void before(){
        tyre = new Tyre(45);
    }

    @Test
    public void hasTyreSize(){
        assertEquals(45, tyre.getTyre());
    }

}
