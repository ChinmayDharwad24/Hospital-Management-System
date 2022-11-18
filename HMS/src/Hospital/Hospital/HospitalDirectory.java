/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Hospital;

import Hospital.Community.Community;
import Hospital.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author chinm
 */
public class HospitalDirectory {
    
    private ArrayList<Hospital> hospitalList;
    
    public HospitalDirectory(){
        hospitalList = new ArrayList<Hospital>();
    }

    public ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(ArrayList<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }
    
    public Hospital addHospital(){
        Hospital newHospital = new Hospital();
        hospitalList.add(newHospital);
        return newHospital;
    }
    
    public void deleteHospital(Hospital hos){
        hospitalList.remove(hos);
    }
    
    public String[] hosArray(){
        String[] hos = new String[hospitalList.size()+1];
        hos[0] = "---Select---";
        int count = 1;
        for (Hospital h: hospitalList){
            hos[count] = h.getHospitalName();
            count++; 
        }
        return hos;
    }
    
    public boolean uiqueHospitalId(int id) {

        for (Hospital h: hospitalList) {

            if (id == h.getHospitalId()) {
                return false;
            }
        }
            return true; 
    } 
    
    
}
