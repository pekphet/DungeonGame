package cc.fish.simplegame.Item;

/**
 * Created by fish on 16-5-17.
 */
public class EquipStatistic {
    private int id;
    private String name;
    private int color;
    private int position;
    private int level;
    private int upgrade;
    private int red;
    private EquipAttr attr;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getUpgrade() {
        return upgrade;
    }

    public void setUpgrade(int upgrade) {
        this.upgrade = upgrade;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public EquipAttr getAttr() {
        return attr;
    }

    public void setAttr(EquipAttr attr) {
        this.attr = attr;
    }
}
