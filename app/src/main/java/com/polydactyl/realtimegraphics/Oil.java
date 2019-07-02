package com.polydactyl.realtimegraphics;


// Creamy is the sum of Palmetic, Stearic and Ricinoleic acids while Bubbly is the sum of Lauric, Myristic and Ricinoleic acids.
public class Oil {

    double sap;
    float lauric;
    float linoleic;
    float linolenic;
    float myristic;
    float oleic;
    float palmitic;
    float ricinoleic;
    float stearic;
    int condition;
    int cleansing;
    int bubbly;
    int hardness;
    int longevity;
    int stability;
    int creamy;

    public Oil(double sap,
               final float lauric,
               final float linoleic,
               final float linolenic,
               final float myristic,
               final  float oleic,
               final float palmitic,
               final float ricinoleic,
               final float stearic){
        this.sap = sap;
        this.lauric=lauric;
        this.linoleic=linoleic;
        this.linolenic=linolenic;
        this.myristic=myristic;
        this.oleic=oleic;
        this.palmitic=palmitic;
        this.ricinoleic=ricinoleic;
        this.stearic=stearic;

        condition = (int) (oleic + ricinoleic + linoleic + linolenic);
        creamy = (int) (palmitic+ stearic + ricinoleic);
        bubbly = (int) (lauric + myristic + ricinoleic);
        hardness = (int) (lauric + myristic + palmitic + stearic);
        cleansing = (int) (lauric + myristic);
        longevity = (int) (palmitic + stearic);
        stability = (int) (palmitic + ricinoleic + stearic);

    }


    public int getCondition() {

        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getCleansing() {
        return cleansing;
    }

    public void setCleansing(int cleansing) {
        this.cleansing = cleansing;
    }

    public int getBubbly() {
        return bubbly;
    }

    public void setBubbly(int bubbly) {
        this.bubbly = bubbly;
    }

    public int getHardness() {
        return hardness;
    }

    public void setHardness(int hardness) {
        this.hardness = hardness;
    }

    public int getLongevity() {
        return longevity;
    }

    public void setLongevity(int longevity) {
        this.longevity = longevity;
    }

    public int getStability() {
        return stability;
    }

    public void setStability(int stability) {
        this.stability = stability;
    }

    public int getCreamy() {
        return creamy;
    }

    public void setCreamy(int creamy) {
        this.creamy = creamy;
    }
}
