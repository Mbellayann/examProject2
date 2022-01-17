package main.oop2;

import java.io.IOException;
import java.text.ParseException;

public class TestOOP2 {
    public static void main(String[] args) throws IOException, ParseException {
        InsuranceReader.readAll();
        PatientReader.readAll();
    }
}
