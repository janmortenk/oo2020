
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Testid {
    
    final Jogi jogi1 = new Jogi("Ema Jõgi", 1.2,2.4,3.5,6.9);
    final Jogi jogi2 = new Jogi("Ema Jõgi", 1.2,2.4,4.5,6.9);
    
    @Test
    public void test1() {
       assertEquals(jogi1, jogi2); 
    }
    

}