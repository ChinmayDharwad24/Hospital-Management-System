 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Patient;

import java.util.ArrayList;

/**
 *
 * @author chinm
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patientList;
    
    public PatientDirectory(){
        this.patientList = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    
    public Patient addPatient(){
        Patient newPatient = new Patient();
        patientList.add(newPatient);
        return newPatient;
    }
    
    public void deletePatient(Patient pat){
        patientList.remove(pat);
    }
    
    public boolean uiquePatientId(int id) {

        for (Patient p : patientList) {

            if (id == p.getPatientId() ) {
                return false;
            }
        }
            return true; 
    } 
    
    public boolean uniquePatientUsername(String username){
        for (Patient p : patientList) {

            if (username.equals(p.getUsername())) {
                return false;
            }
        }
            return true;
    }
    
    public Patient findPatient(String username, String password){
        
        for (Patient p: patientList){
            if (username.equals(p.getUsername()) && password.equals(p.getPassword())){
                return p;
            }
        }
        
        return null;
        
    }
    
    public String[] patNameArray(){
        String[] patName = new String[patientList.size()+1];
        patName[0] = "---Select---";
        int count = 1;
        for (Patient p: patientList){
            patName[count] = p.getName();
            count++; 
        }
        return patName;
    }
    
    public String[] patUnameArray(){
        String[] patUname = new String [patientList.size()+1];
        patUname[0] = "---Select---";
        int count = 1;
        for (Patient p: patientList){
            patUname[count] = p.getUsername();
            count++; 
        }
        return patUname;
    }
}
