package main.oop2;

import java.util.ArrayList;
import java.util.List;

public class Insurance {
    private Integer insurance_id;
    private String insurance_name;

    public List<Insurance> listInsurance = new ArrayList<>();

    public List<String> getListInsurance() {
        return this.toStringArr();
    }


    public Integer getInsurance_id() {
        return insurance_id;
    }

    public void setInsurance_id(Integer insurance_id) {
        this.insurance_id = insurance_id;
    }

    public String getInsurance_name() {
        return insurance_name;
    }

    public void setInsurance_name(String insurance_name) {
        this.insurance_name = insurance_name;
    }

    public List<String> toStringArr() {
        List<String> result = new ArrayList<>();
        for (int i = 0; i<this.listInsurance.size(); i++){
            result.add(this.listInsurance.get(i).insurance_name);
        }
        return result;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "insurance_name='" + this.insurance_name + '\'' +
                '}';
    }
}
