package model;
// Generated May 7, 2017 10:50:54 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * VehicleBrand generated by hbm2java
 */
public class VehicleBrand  implements java.io.Serializable {


     private Integer vehicleBrandId;
     private String vehicleBrand;
     private Set vehicleModels = new HashSet(0);

    public VehicleBrand() {
    }

    public VehicleBrand(String vehicleBrand, Set vehicleModels) {
       this.vehicleBrand = vehicleBrand;
       this.vehicleModels = vehicleModels;
    }
   
    public Integer getVehicleBrandId() {
        return this.vehicleBrandId;
    }
    
    public void setVehicleBrandId(Integer vehicleBrandId) {
        this.vehicleBrandId = vehicleBrandId;
    }
    public String getVehicleBrand() {
        return this.vehicleBrand;
    }
    
    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }
    public Set getVehicleModels() {
        return this.vehicleModels;
    }
    
    public void setVehicleModels(Set vehicleModels) {
        this.vehicleModels = vehicleModels;
    }




}


