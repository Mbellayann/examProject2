package main.oop2;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Patient {
    private String pat_num_HC;
    private String pat_lastname;
    private String pat_firstname;
    private String pat_address;
    private String pat_tel;
    private Integer pat_insurance_id;
    private Date pat_subscription_date;

    public List<Patient> listPatient = new ArrayList<>();

    public Patient() {
        this.pat_num_HC = pat_num_HC;
        this.pat_lastname = pat_lastname;
        this.pat_firstname = pat_firstname;
        this.pat_address = pat_address;
        this.pat_tel = pat_tel;
        this.pat_insurance_id = pat_insurance_id;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        this.pat_subscription_date = date;
    }

    public String getPat_num_HC() {
        return pat_num_HC;
    }

    public List<Patient> getListPatient() {
        return listPatient;
    }

    public void setListPatient(List<Patient> listPatient) {
        this.listPatient = listPatient;
    }

    public Date getPat_date_sub_date() {
        return pat_subscription_date;
    }

    public void setPat_date_sub_date(Date pat_subscription_date) {
        this.pat_subscription_date = pat_subscription_date;
    }



    public void setPat_num_HC(String pat_num_HC) {
        this.pat_num_HC = pat_num_HC;
    }

    public String getPat_lastname() {
        return pat_lastname;
    }

    public void setPat_lastname(String pat_lastname) {
        this.pat_lastname = pat_lastname;
    }

    public String getPat_firstname() {
        return pat_firstname;
    }

    public void setPat_firstname(String pat_firstname) {
        this.pat_firstname = pat_firstname;
    }

    public String getPat_address() {
        return pat_address;
    }

    public void setPat_address(String pat_address) {
        this.pat_address = pat_address;
    }

    public String getPat_tel() {
        return pat_tel;
    }

    public void setPat_tel(String pat_tel) {
        this.pat_tel = pat_tel;
    }

    public Integer getPat_insurance_id() {
        return pat_insurance_id;
    }

    public void setPat_insurance_id(Integer pat_insurance_id) {
        this.pat_insurance_id = pat_insurance_id;
    }



}
