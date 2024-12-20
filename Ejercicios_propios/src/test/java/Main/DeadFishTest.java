package Main;

import com.hellrider.katas.DeadFish;

import static org.junit.jupiter.api.Assertions.*;

public class DeadFishTest {
    @org.junit.jupiter.api.Test
    public void exampleTests() {
        assertArrayEquals(new int[] {8, 64}, DeadFish.parse("iiisdoso"));
        assertArrayEquals(new int[] {8, 64, 3600}, DeadFish.parse("iiisdosodddddiso"));
    }
}
