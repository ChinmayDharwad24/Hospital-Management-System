/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Encounter;

/**
 *
 * @author chinm
 */
public class Encounter {
    
    private String encounterNo;
    private String hospital;
    private String doctorName;
    private String doctorUserName;
    private String patientName;
    private String patientUsername;
    private int rooomNo;
    private String date;
    private String time;
    private String comment;

    public String getEncounterNo() {
        return encounterNo;
    }

    public void setEncounterNo(String encounterNo) {
        this.encounterNo = encounterNo;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorUserName() {
        return doctorUserName;
    }

    public void setDoctorUserName(String doctorUserName) {
        this.doctorUserName = doctorUserName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientUsername() {
        return patientUsername;
    }

    public void setPatientUsername(String patientUsername) {
        this.patientUsername = patientUsername;
    }

    public int getRooomNo() {
        return rooomNo;
    }

    public void setRooomNo(int rooomNo) {
        this.rooomNo = rooomNo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    @Override
    public String toString(){
        return encounterNo;
    }
    
    
}
