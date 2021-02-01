package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class GradeFileTest {

    GradeFile parser = new GradeFile();

    @Test
    public void testParse_emptyFile_emptyList() throws IOException {
        List<Float> values =
                parser.parse(Thread.currentThread().getContextClassLoader().getResourceAsStream("empty.txt"));
        Assertions.assertEquals(0, values.size());
    }

    @Test
    public void testParse_threeItems_sizeIsThree() throws IOException {
        List<Float> values =
                parser.parse(Thread.currentThread().getContextClassLoader().getResourceAsStream("three.txt"));
        Assertions.assertEquals(3, values.size());
    }

    @Test
    public void testParse_invalidFile_throwsCheckedException() {
        Assertions.assertThrows(GradeFile.ParseException.class,
                ()-> parser.parse(Thread.currentThread().getContextClassLoader().getResourceAsStream("invalid.txt")));
    }
}
