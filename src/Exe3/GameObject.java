package Exe3;

import javax.swing.*;

public class GameObject {

    //instance variables
    private double x;
    private double y;
    private String center;
    private double velocity;
    private String state;
    private String rotation;

    // default constructor
    public GameObject(){

    }
    //Declare a constructor with all parameter
    public GameObject(double x, double y, double velocity, String state, String rotation){
        this.x = x;
        this.y = y;
        this.velocity= velocity;
        this.state=state;
        this.rotation=rotation;}
    // setter
    public void setX(double v){this.x=x;}
    public void setY(double v){this.y=y;}
    public void setCenter(){this.center=center;}

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setRotation(String rotation) {
        this.rotation = rotation;
    }

    //getter
    public double getX(){return x;}

    public double getY() {
        return y;
    }

    public String getCenter() {
        return ("("+getX()+","+getY()+")");
    }
    public double getVelocity() {
        return velocity;
    }

    public String getState() {
        return state;
    }

    public String getRotation() {
        return rotation;
    }

    //method to display information collected
    public String getGameObjectInfo()
    {
        return "The game object's center: " + getCenter()+"\nVelocity: " + getVelocity()+ "\nState (alive or dead): "+getState()+ "\nRotation status: " + getRotation();
    }
}
