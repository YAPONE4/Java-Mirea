package ru.mirea.homeworkOneClasses;

public class Ball {
    private String club;
    private float pumping;

    public Ball(String n, float p) {
        club = n;
        pumping = p;
        if (pumping > 100) {
            pumping = 100;
        }
        if (pumping < 0) {
            pumping = 0;
        }
    }
    public Ball(String n) {
        club = n;
        pumping = 0;
    }
    public Ball(){
        club = "Nameless";
        pumping = 0;
    }
    public void setClub(String n) {
        this.club = n;
    }
    public void pumpTheBall(float p) {
        this.pumping += p;
        if (this.pumping > 100) {
            pumping = 100;
        }
    }
    public void pumpOutTheBall(float p) {
        this.pumping -= p;
        if (this.pumping < 0) {
            pumping = 0;
        }
    }
    public String getClub() {
        return this.club;
    }
    public float getPumping() {
        return this.pumping;
    }
    public String toString() {
        return ("This is a ball from " + this.club + " club, pumped by " + this.pumping + "%");
    }
    public void kickStrength(float kick) {
        float kickStrength = this.pumping * kick;
        System.out.println("This ball from " + this.club + " club were flew away by the kick with " + kickStrength +
                " strength");
    }
}
