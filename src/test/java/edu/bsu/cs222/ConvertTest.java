package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConvertTest {

    Convert convert = new Convert();


    @Test
    public void testGrade_A() {
        Assertions.assertEquals(convert.toGrade(8f/9f+0.1f), Grade.A);
    }


    @Test
    public void testGrade_B() {
        Assertions.assertEquals(convert.toGrade(13f/18f+0.1f), Grade.B);
    }

    @Test
    public void testGrade_C() {
        Assertions.assertEquals(convert.toGrade(8f/15f+0.1f), Grade.C);
    }

    @Test
    public void testGrade_D() {
        Assertions.assertEquals(convert.toGrade(8f/15f), Grade.D);
    }


    @Test
    public void testGrade_F() {
        Assertions.assertEquals(convert.toGrade(1f/3f), Grade.F);
    }
}
