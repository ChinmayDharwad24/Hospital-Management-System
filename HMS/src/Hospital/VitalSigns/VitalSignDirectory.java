/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.VitalSigns;

import java.util.ArrayList;

/**
 *
 * @author chinm
 */
public class VitalSignDirectory {
    
    private ArrayList<VitalSign> vitalSignList;
    
    public VitalSignDirectory(){
        vitalSignList = new ArrayList<VitalSign>();
    }

    public ArrayList<VitalSign> getVitalSignList() {
        return vitalSignList;
    }

    public void setVitalSignList(ArrayList<VitalSign> vitalSignList) {
        this.vitalSignList = vitalSignList;
    }
    
    public VitalSign addVitalSign(){
        VitalSign newVS = new VitalSign();
        vitalSignList.add(newVS);
        return newVS;
    }
}
