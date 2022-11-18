/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.House;

import Hospital.Community.Community;

/**
 *
 * @author chinm
 */
public class House extends Community {
    
    private int houseId;
    private String houseNo;

    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }
    
    @Override
    public String toString(){
        String houId = String.valueOf(houseId);
        return houId;
    }
    
    
}
