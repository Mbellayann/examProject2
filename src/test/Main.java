import main.oop2.Patient;

public class Main {
    public static void main(String[] args) throws Exception {
        Patient pat = new Patient();
        PatientBLService.computeSeniority(pat);
    }

}
