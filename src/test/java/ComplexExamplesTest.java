import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexExamplesTest {

    @Test
    void fuzzySearch() {
        boolean result;

        result = ComplexExamples.fuzzySearch("car", "ca6$$#_rtwheel");
        assertTrue(result);

        result = ComplexExamples.fuzzySearch("cwhl", "cartwheel");
        assertTrue(result);

        result = ComplexExamples.fuzzySearch("cwhee", "cartwheel");
        assertTrue(result);

        result = ComplexExamples.fuzzySearch("cartwheel", "cartwheel");
        assertTrue(result);

        result = ComplexExamples.fuzzySearch("cwheeel", "cartwheel");
        assertFalse(result);

        result = ComplexExamples.fuzzySearch("lw", "cartwheel");
        assertFalse(result);
    }
}