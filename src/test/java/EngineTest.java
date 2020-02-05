import componenets.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine(400);
    }

    @Test
    public void hasHorsePower(){
        assertEquals(400, engine.getHorsePower());
    }




}
