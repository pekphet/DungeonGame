package cc.fish.simplegame.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by fish on 16-5-17.
 */
public class EquipAttr {
    private int patk = 0;
    private int matk = 0;
    private int watk = 0;
    private int pdef = 0;
    private int mdef = 0;
    private int stg = 0;
    private int itl = 0;
    private int con = 0;
    private int spr = 0;
    private int mis = 0;
    private int hit = 0;
    private int pcri = 0;
    private int mcri = 0;
    private Map<ExtraAttr, Integer> extra = new HashMap<>();
    private List<Integer> skill = new ArrayList<>();

    public int getPatk() {
        return patk;
    }

    public void setPatk(int patk) {
        this.patk = patk;
    }

    public int getMatk() {
        return matk;
    }

    public void setMatk(int matk) {
        this.matk = matk;
    }

    public int getWatk() {
        return watk;
    }

    public void setWatk(int watk) {
        this.watk = watk;
    }

    public int getPdef() {
        return pdef;
    }

    public void setPdef(int pdef) {
        this.pdef = pdef;
    }

    public int getMdef() {
        return mdef;
    }

    public void setMdef(int mdef) {
        this.mdef = mdef;
    }

    public int getStg() {
        return stg;
    }

    public void setStg(int stg) {
        this.stg = stg;
    }

    public int getItl() {
        return itl;
    }

    public void setItl(int itl) {
        this.itl = itl;
    }

    public int getCon() {
        return con;
    }

    public void setCon(int con) {
        this.con = con;
    }

    public int getSpr() {
        return spr;
    }

    public void setSpr(int spr) {
        this.spr = spr;
    }

    public int getMis() {
        return mis;
    }

    public void setMis(int mis) {
        this.mis = mis;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public int getPcri() {
        return pcri;
    }

    public void setPcri(int pcri) {
        this.pcri = pcri;
    }

    public int getMcri() {
        return mcri;
    }

    public void setMcri(int mcri) {
        this.mcri = mcri;
    }

    public Map<ExtraAttr, Integer> getExtra() {
        return extra;
    }

    public void setExtra(Map<ExtraAttr, Integer> extra) {
        this.extra = extra;
    }

    public List<Integer> getSkill() {
        return skill;
    }

    public void setSkill(List<Integer> skill) {
        this.skill = skill;
    }
}
