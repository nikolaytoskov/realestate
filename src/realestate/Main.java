/*
Да се изгради йерархия от класове представящи недвижима собственост с и без постройка. 
Да се изчислява цената на собствеността въз основа на квадратурата и цената на земята. 
(17 лв. за незастроена площ, 38 лв. за застроена).
*/
package realestate;
public class Main {
    public static void main(String[] args) {
       RealEstateInterface emptyPlace = new EmptyGround(950.50,1150.30);
       RealEstateEmploee petq = new RealEstateEmploee(emptyPlace, "Петя");
       System.out.print("Здравейте, Вас ви обслужва "+petq.getNameEmploee()+". ");
       System.out.println("Цената на пазарния имот, който харесахте е:  "+petq.calculatePrice()*17+" лв.");
       System.out.println("Ако Ви нтересува цена на застроените имоти, ще Ви пехвърля към моята колежка Ваня.");
       
       RealEstateInterface placeWithHouse = new GroundWithHouse(200, 600.35);
       RealEstateEmploee vanq = new RealEstateEmploee(placeWithHouse, "Ваня");
       System.out.print("Здравейте, Вас ви обслужва "+vanq.getNameEmploee()+". ");
       System.out.println("Цената на застроения имот, който харесахте е:  "+vanq.calculatePrice()*38+" лв.");      
    }
}
