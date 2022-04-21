import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class TestXxx {
    int i;

    @Test
    public void testMin(){
        int min = Xxx.min(2, 3, 4);
        if (min != 2){
            fail();
        }

        assertEquals(2, min, "Провал");
//        while (true){
//
//        }
    }

    @Disabled
    public void testConstructor(){
        Xxx obj = new Xxx(100);

        assertEquals(100, obj.getAttr());
    }

    @Test
    public void testDiv(){
        Xxx obj = new Xxx(100);

        assertEquals(10, obj.div(10));
        assertEquals(1, obj.div(100));
        assertEquals(20, obj.div(10));

        try{
            obj.div(0);
            fail("Провал!");
        }
        catch (Exception e){

        }
    }

    @BeforeEach()
    public void f(){
        System.out.println("fasfa");
        i--;
    }
}
