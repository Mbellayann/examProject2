package main.oop2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsuranceReader {
    public static void readAll() throws IOException {
        String path = "C:\\Users" +
                "\\LENOVO X1 Carbone\\OneDrive - EPITA\\Documents" +
                "\\JAVA\\yann_symphorien_onguene_symphorien\\src\\" +
                "resources\\insurances.csv";
        List<String> lines = Files.readAllLines(new File(path).toPath());
        Insurance ins = new Insurance();
        for(int i = 0; i<lines.size(); i++){
            ins.setInsurance_id(i);
            ins.setInsurance_name(lines.get(0));
            ins.listInsurance.add(ins);
        }
        System.out.println(ins.listInsurance);
    }
}
