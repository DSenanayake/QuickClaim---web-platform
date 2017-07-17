package model;
// Generated May 7, 2017 10:50:54 PM by Hibernate Tools 4.3.1



/**
 * ClaimPhoto generated by hbm2java
 */
public class ClaimPhoto  implements java.io.Serializable {


     private Integer claimPhotoId;
     private Claim claim;
     private String photoUrl;
     private String perspective;

    public ClaimPhoto() {
    }

	
    public ClaimPhoto(Claim claim) {
        this.claim = claim;
    }
    public ClaimPhoto(Claim claim, String photoUrl, String perspective) {
       this.claim = claim;
       this.photoUrl = photoUrl;
       this.perspective = perspective;
    }
   
    public Integer getClaimPhotoId() {
        return this.claimPhotoId;
    }
    
    public void setClaimPhotoId(Integer claimPhotoId) {
        this.claimPhotoId = claimPhotoId;
    }
    public Claim getClaim() {
        return this.claim;
    }
    
    public void setClaim(Claim claim) {
        this.claim = claim;
    }
    public String getPhotoUrl() {
        return this.photoUrl;
    }
    
    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
    public String getPerspective() {
        return this.perspective;
    }
    
    public void setPerspective(String perspective) {
        this.perspective = perspective;
    }




}

