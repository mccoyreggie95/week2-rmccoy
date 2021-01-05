package edu.bsu.cs222;

import java.io.IOException;
import java.util.List;

public class GradeTool {
    public static void main(String[] args) {
        GradeFileParser parser = new GradeFileParser();
        List<Float> list = null;
        try {
            list = parser.parse(System.in);
        } catch (IOException ioException) {
            System.out.println("There was a problem reading from the input stream.");
        } catch (GradeFileParser.ParseException parseException) {
            System.out.println("Invalid input format.");
        }

        assert list != null;

        TriagePolicy policy = new TriagePolicy();
        for (float number : list) {
            System.out.println(policy.toGrade(number));
        }
    }
}
