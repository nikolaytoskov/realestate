
package realestate;

public class GroundWithHouse implements RealEstateInterface{
      private double houseA;
      private double houseB;
      
      public GroundWithHouse(double houseA, double houseB){
          this.houseA = houseA;
          this.houseB = houseB;
      }
    @Override
    public double calculatePrice(){
        return (2*houseA)+(2*houseB);
        
    }
}
