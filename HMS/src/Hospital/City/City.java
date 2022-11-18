/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.City;

/**
 *
 * @author chinm
 */
public class City {
    
    protected int cityId;
    protected String Cityname;
    protected String state;
    protected String country;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return Cityname;
    }

    public void setCityName(String name) {
        this.Cityname = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    @Override
    public String toString(){
        String citId = String.valueOf(cityId);
        return citId;
    }
    
    
}
