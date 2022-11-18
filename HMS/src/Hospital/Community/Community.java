/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Community;

import Hospital.City.City;

/**
 *
 * @author chinm
 */
public class Community extends City {
    
    protected int communityId;
    protected String communityName;
//    private String cityName;
//    private String state;
//    private String country;
    protected long zipCode;

    public int getCommunityId() {
        return communityId;
    }

    public void setCommunityId(int communityId) {
        this.communityId = communityId;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public long getZipCode() {
        return zipCode;
    }

    public void setZipCode(long zipCode) {
        this.zipCode = zipCode;
    }
    
    @Override
    public String toString(){
        String commId = String.valueOf(communityId);
        return commId;
    }
    
    
}
