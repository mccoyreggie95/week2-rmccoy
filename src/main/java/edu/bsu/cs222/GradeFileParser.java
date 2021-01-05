package edu.bsu.cs222;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GradeFileParser {
    static final class ParseException extends RuntimeException {}

    public List<Float> parse(InputStream input) throws IOException {
        if (input == null) {
            throw new IllegalArgumentException("Input stream must not be null.");
        }
        List<Float> result = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        String line;
        while ((line = reader.readLine()) != null) {
            try {
                float f = Float.parseFloat(line);
                result.add(f);
            } catch (NumberFormatException numberFormatException) {
                throw new ParseException();
            }
        }
        return result;
    }
}
