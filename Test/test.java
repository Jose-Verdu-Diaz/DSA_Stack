import org.junit.*;
import main.*;

public class test {
    StackClass st = new StackClass<Integer>(4);
    @Before
    public void setup() {
        st.stack(1);
    }

    @Test

    public void teststack() throws Exception{
        st.stack(2);
    }
}
