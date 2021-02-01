package edu.bsu.cs222;

import java.io.IOException;
import java.util.List;


public class GradeTool {
    public static void main(String[] args) {
        GradeFile parser = new GradeFile();
        List<Float> gradeList = null;
        try {
            gradeList = parser.parse(System.in);
        } catch (IOException ioException) {
            System.out.println("There was a problem reading from the input stream.");
        } catch (GradeFile.ParseException parseException) {
            System.out.println("Invalid input format.");
        }

        assert gradeList != null;

        Convert policy = new Convert();
        for (float grade : gradeList) {
            System.out.println(policy.toGrade(grade));
        }
    }
}
