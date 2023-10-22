package Java17.Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {

    private String name ;
    private int hitPoints ;
    private int strength ;
    private String weapons ;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapons = "sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapons() {
        return weapons;
    }

    public void setWeapons(String weapons) {
        this.weapons = weapons;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapons='" + weapons + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0,this.name);
        values.add(1,""+this.hitPoints);
        values.add(2,""+this.strength);
        values.add(3,this.weapons);
        return values ;
    }

    @Override
    public void read(List<String> saved) {

        if(saved!=null && saved.size()>0){
             this.name = saved.get(0);
            this.hitPoints = Integer.parseInt(saved.get(1));
            this.strength = Integer.parseInt(saved.get(2));
            this.weapons = saved.get(2);
        }


    }
}
