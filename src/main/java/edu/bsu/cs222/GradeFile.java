package edu.bsu.cs222;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Parses a stream of grades.
 *
 * Each line of the stream is expected to be a single numeric value
 * in the range [0,1].
 */
public class GradeFile {
    static final class ParseException extends RuntimeException {}


    public List<Float> parse(InputStream classPercentage) throws IOException {
        if (classPercentage == null) {
            throw new IllegalArgumentException("Input stream must not be null.");
        }
        List<Float> gradeList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(classPercentage));
        String gradeLine;
        while ((gradeLine = reader.readLine()) != null) {
            try {
                float grade = Float.parseFloat(gradeLine);
                gradeList.add(grade);
            } catch (NumberFormatException numberFormatException) {
                throw new ParseException();
            }
        }
        return gradeList;
    }
}
