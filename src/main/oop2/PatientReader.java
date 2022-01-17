package main.oop2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class PatientReader {
    public static List<Patient> readAll() throws IOException, ParseException {
        List<String> lines = Files.readAllLines(new File("C:\\Users" +
                "\\LENOVO X1 Carbone\\OneDrive - EPITA\\Documents" +
                "\\JAVA\\yann_symphorien_onguene_symphorien\\src\\" +
                "resources\\patients.csv").toPath());
        Patient pat = new Patient();
        String[] parts ;
        for(int i = 1; i<lines.size(); i++) {
            parts = lines.get(i).split(";");
            System.out.println(parts[i]);
            pat.setPat_num_HC(parts[5]);
            pat.setPat_lastname(parts[0]);
            pat.setPat_firstname(parts[1]);
            pat.setPat_address(parts[2]);
            pat.setPat_tel(parts[3]);
            Integer id = Integer.parseInt(parts[4]);
            pat.setPat_insurance_id(Integer.parseInt(parts[5]));
            String date = parts[6];
            Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(date);
            pat.setPat_date_sub_date(date1);
            pat.listPatient.add(pat);

        }
        System.out.println(pat.listPatient);
        return pat.listPatient;
    }
}
