
package realestate;
public class RealEstateEmploee {
     private RealEstateInterface estate;
     private String nameEmploee;
     
     public RealEstateEmploee(RealEstateInterface estate, String nameEmploee){
         this.estate = estate;
         this.nameEmploee = nameEmploee;
     }

    public RealEstateInterface getEstate() {
        return estate;
    }

    public void setEstate(RealEstateInterface estate) {
        this.estate = estate;
    }

    public String getNameEmploee() {
        return nameEmploee;
    }

    public void setNameEmploee(String nameEmploee) {
        this.nameEmploee = nameEmploee;
    }


    public double calculatePrice(){
        return estate.calculatePrice();
    }
}
