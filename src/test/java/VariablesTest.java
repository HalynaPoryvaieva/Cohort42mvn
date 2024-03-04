import extend.Variables;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VariablesTest {

    @Test
    public void testGetValue(){
        Variables variables=new Variables();

        int a=variables.getValue("a");
        Assertions.assertEquals(0,a);

        Integer b= variables.getValue("ab");
        Assertions.assertNull(b);

        Integer c= variables.getValue("");
        Assertions.assertNull(c);

        Integer d= variables.getValue("A");
        Assertions.assertNull(d);

        variables.setValue("z","123");
        a= variables.getValue("z");
        Assertions.assertEquals(123,a);
    }
}
