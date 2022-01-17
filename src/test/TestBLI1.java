import main.oop2.Patient;
import main.oop2.PatientReader;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class TestBLI1 {
    public static List<Patient> computingSeniority() throws IOException, ParseException {
        List<Patient> result = new ArrayList<>();
        List<Patient> resulta = new ArrayList<>();
        result = PatientReader.readAll();
        for (Patient p: result){
            for (Patient m: result){
                if (p.getPat_date_sub_date().compareTo(m.getPat_date_sub_date())>0){
                    resulta.add(p);
                    System.out.println(result);
                    System.out.println(resulta);
                }
            }
        }
        return resulta;
    }
}
