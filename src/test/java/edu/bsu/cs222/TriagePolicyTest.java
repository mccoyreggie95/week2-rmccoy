package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriagePolicyTest {

    @Test
    public void testGrade_topA() {
        TriagePolicy triagePolicy = new TriagePolicy();
        Assertions.assertEquals(triagePolicy.toGrade(1.0f), Grade.A);
    }

    @Test
    public void testGrade_bottomA() {
        TriagePolicy triagePolicy = new TriagePolicy();
        Assertions.assertEquals(triagePolicy.toGrade(8f/9f+0.1f), Grade.A);
    }

    @Test
    public void testGrade_topB() {
        TriagePolicy triagePolicy = new TriagePolicy();
        Assertions.assertEquals(triagePolicy.toGrade(8f/9f), Grade.B);
    }

    @Test
    public void testGrade_bottomB() {
        TriagePolicy triagePolicy = new TriagePolicy();
        Assertions.assertEquals(triagePolicy.toGrade(13f/18f+0.1f), Grade.B);
    }

    @Test
    public void testGrade_topC() {
        TriagePolicy triagePolicy = new TriagePolicy();
        Assertions.assertEquals(triagePolicy.toGrade(13f/18f), Grade.C);
    }

    @Test
    public void testGrade_bottomC() {
        TriagePolicy triagePolicy = new TriagePolicy();
        Assertions.assertEquals(triagePolicy.toGrade(8f/15f+0.1f), Grade.C);
    }

    @Test
    public void testGrade_topD() {
        TriagePolicy triagePolicy = new TriagePolicy();
        Assertions.assertEquals(triagePolicy.toGrade(8f/15f), Grade.D);
    }

    @Test
    public void testGrade_bottomD() {
        TriagePolicy triagePolicy = new TriagePolicy();
        Assertions.assertEquals(triagePolicy.toGrade(1f/3f + 0.1f), Grade.D);
    }

    @Test
    public void testGrade_topF() {
        TriagePolicy triagePolicy = new TriagePolicy();
        Assertions.assertEquals(triagePolicy.toGrade(1f/3f), Grade.F);
    }
}
