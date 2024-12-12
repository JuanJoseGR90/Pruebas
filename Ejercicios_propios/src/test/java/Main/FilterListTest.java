package Main;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.hellrider.FilterList.filterList;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FilterListTest {

        @Test
        public void examples() {
            assertEquals(List.of(1, 2), filterList(List.of(1, 2, "a", "b")), "For input: [1, 2, \"a\", \"b\"]");
            assertEquals(List.of(1, 0, 15), filterList(List.of(1, "a", "b", 0, 15)), "For input: [1, \"a\", \"b\", 0, 15]");
            assertEquals(List.of(1, 2, 123), filterList(List.of(1, 2, "aasf", "1", "123", 123)), "For input: [1, 2, \"aasf\", \"1\", \"123\", 123]");
        }
    }
