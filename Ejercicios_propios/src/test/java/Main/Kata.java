package Main;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Kata {
    @Test public void testSomething() {
        Assert.assertEquals("8j8mBliB8gimjB8B8jlB", com.hellrider.Kata.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        Assert.assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", com.hellrider.Kata.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        Assert.assertEquals("8aaaaaddddr", com.hellrider.Kata.noSpace("8aaaaa dddd r     "));
        Assert.assertEquals("jfBmgklf8hg88lbe8", com.hellrider.Kata.noSpace("jfBm  gk lf8hg  88lbe8 "));
        Assert.assertEquals("8jaam", com.hellrider.Kata.noSpace("8j aam"));
    }
}
