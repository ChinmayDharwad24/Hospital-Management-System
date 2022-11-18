/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.System;

import Hospital.Doctor.DoctorDirectory;
import Hospital.Patient.PatientDirectory;

/**
 *
 * @author chinm
 */
public class HospitalSystem {
    
    PatientDirectory patientList;
    DoctorDirectory doctorList;
    
    public HospitalSystem(){
        patientList = new PatientDirectory();
        doctorList = new DoctorDirectory();
    }

    public PatientDirectory getPatientList() {
        return patientList;
    }

    public void setPatientList(PatientDirectory patientList) {
        this.patientList = patientList;
    }

    public DoctorDirectory getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(DoctorDirectory doctorList) {
        this.doctorList = doctorList;
    }
    
    
}
