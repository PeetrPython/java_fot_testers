package ry.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    void cannotCreateRectangleWithNegativeSide() {
        try {
            new Rectangle(-5.0, 3.0);
            Assertions.fail();
        }catch (IllegalArgumentException exception) {
            //ok
        }
    }

    @Test
    void testEqulaity() {
        var r1 = new Rectangle(5.0, 4.0);
        var r2 = new Rectangle(4.0, 5.0);
        Assertions.assertEquals(r1, r2);
    }

}
