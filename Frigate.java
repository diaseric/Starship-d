public class Frigate extends Starship implements Starship.Stance {
    public Frigate(String newName){
        int minHull = 1500;
        int maxHull = 2000;
        int minShield = 2000;
        int maxShield = 2500;
        int minBeam = 2500;
        int maxBeam = 3500;
        int minTorp = 20;
        int maxTorp = 30;
    }
    public String Stance(){
        return "Defensive";
    }
}
