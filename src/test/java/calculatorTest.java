import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {
    @org.junit.jupiter.api.Test
    void add() {
   calculator cal=new calculator(null);
   Assertions.assertEquals(cal.add(5,3),8);
    }
    @org.junit.jupiter.api.Test
    void sub() {
        calculator cal=new calculator(null);
        Assertions.assertEquals(cal.sub(5,3),2);
    }
    @Test
    void testnegativenum(){
        calculator cal=new calculator(null);
        try{
            cal.add(-1,5);
            fail("should throw exception");
        }catch (RuntimeException e){}
        try{
            cal.add(5,-1);
            fail("should throw exception");
        }catch (RuntimeException e){}
    }
    @Test
    void name(){
        calculator cal=new calculator(null);
        Assertions.assertEquals("standared",cal.name,"wrong");
    }
}