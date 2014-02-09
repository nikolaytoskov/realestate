
package realestate;
public class EmptyGround implements RealEstateInterface{
    private double groundA;
    private double groundB;
    
    public EmptyGround(double groundA, double groundB){
        this.groundA = groundA;
        this.groundB = groundB;
    }
     
    @Override
     public double calculatePrice(){
         return (2*groundA)+(2*groundB);
     }
}

