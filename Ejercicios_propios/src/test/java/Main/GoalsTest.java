package Main;

import com.hellrider.Goals;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class GoalsTest {

        @Test
        public void basicTests() {
            assertEquals(0, Goals.goals(0, 0, 0));
            assertEquals(58, Goals.goals(43, 10, 5));
        }
    }
