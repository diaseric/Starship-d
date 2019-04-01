public class Cruiser extends Starship implements Starship.Stance{
    public Cruiser(String newName){
        int minHull = 2000;
        int maxHull = 2500;
        int minShield = 2000;
        int maxShield = 2500;
        int minBeam = 3000;
        int maxBeam = 4000;
        int minTorp = 20;
        int maxTorp = 35;
    }
    public String Stance(){
        return "Offensive";
    }
}
