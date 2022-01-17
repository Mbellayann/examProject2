import main.oop2.Patient;
import main.oop2.PatientReader;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatientBLService {

    public static Integer computeSeniority(Patient patient) throws IOException, ParseException {
        List<Patient> listPat = PatientReader.readAll();
        for (Patient p:listPat){
            if(patient.getPat_date_sub_date().compareTo(p.getPat_date_sub_date()) > 0 ){
                return patient.getPat_insurance_id();
            }else {
                return p.getPat_insurance_id();
            }
        }
        return 1;
    }
    public static List<Patient> computeSeniorityByPatient(List<Patient> patients){
        List<Patient> resulta = new ArrayList<>();
        for (Patient p : patients){
            for (Patient s: patients){
                if (Integer.parseInt(p.getPat_num_HC()) > Integer.parseInt(s.getPat_num_HC())){
                    resulta.add(p);
                }
            }
        }
        return resulta;
    }
}
