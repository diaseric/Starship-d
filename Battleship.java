public class Battleship extends Starship implements Starship.Stance {
    public Battleship(String newName){
        int minHull = 3000;
        int maxHull = 5000;
        int minShield = 1500;
        int maxShield = 2000;
        int minBeam = 4000;
        int maxBeam = 5000;
        int minTorp = 40;
        int maxTorp = 50;
    }
    public String Stance(){
        return "Offensive";
    }
}
