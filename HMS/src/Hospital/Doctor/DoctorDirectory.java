/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Doctor;

import Hospital.Community.Community;
import Hospital.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author chinm
 */
public class DoctorDirectory {
    
    private ArrayList<Doctor> doctorList;
    
    public DoctorDirectory(){
        doctorList = new ArrayList<Doctor>();
        
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }
    
    public Doctor addDoctor(){
        Doctor newDoc = new Doctor();
        doctorList.add(newDoc);
        return newDoc;
    }
    
    public void deleteDoctor(Doctor doc){
        doctorList.remove(doc);
        
    }
    
    public Doctor findDoctor(String username, String password){
        
        for(Doctor d: doctorList){
            if(username.equals(d.getUsername()) && password.equals(d.getPassword()) ){
                return d;
            }
        }
        return null;
    }
    
    public String[] docNameArray(){
        String[] docName = new String[doctorList.size()+1];
        docName[0] = "---Select---";
        int count = 1;
        for (Doctor d: doctorList){
            docName[count] = d.getName();
            count++; 
        }
        return docName;
    }
    
    public String[] docUnameArray(){
        String[] docUname = new String[doctorList.size()+1];
        docUname[0] = "---Select---";
        int count = 1;
        for (Doctor d: doctorList){
            docUname[count] = d.getUsername();
            count++; 
        }
        return docUname;
    }
    
    public boolean uiqueDoctorId(int id) {

        for (Doctor d : doctorList) {

            if (id == d.getDoctorId()) {
                return false;
            }
        }
            return true; 
    } 
    
    public boolean uniqueDoctorUsername(String username){
        for (Doctor d: doctorList) {

            if (username.equals(d.getUsername())) {
                return false;
            }
        }
            return true;
    }
}
