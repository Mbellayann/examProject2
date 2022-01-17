import main.oop2.Patient;
import main.oop2.PatientReader;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class TestBLI2 {
    public static List<Patient> computeSeniorityByPatient() throws IOException, ParseException {
        List<Patient> result = new ArrayList<>();
        List<Patient> resulta = new ArrayList<>();
        result = PatientReader.readAll();
        for (Patient p: result){
            for (Patient m: result){
                if (Integer.parseInt(p.getPat_num_HC()) > Integer.parseInt(m.getPat_num_HC())){
                    resulta.add(p);
                    System.out.println(resulta);
                }
            }
        }
        return resulta;
    }

}
