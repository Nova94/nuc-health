package nucchallenge.utils;

/**
 * Created by nova on 4/21/15.
 */
public class Patient {
    private String name;
    private int patientid;
    private int illnesscodes[];

    public Patient(String name, int patientid, int[] illnesscodes) {
        this.name = name;
        this.patientid = patientid;
        this.illnesscodes = illnesscodes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPatientid() {
        return patientid;
    }

    public void setPatientid(int patientid) {
        this.patientid = patientid;
    }

    public int[] getIllnesscodes() {
        return illnesscodes;
    }

    public void setIllnesscodes(int[] illnesscodes) {
        this.illnesscodes = illnesscodes;
    }

}