package it.unibo.encapsulation;

public class SmartLamp {

    private boolean light = false;
    private int intensity = 0;
    private String color = "bianco";

    public SmartLamp(boolean light, int intensity, String color){
        this.light = light;
        this.intensity = intensity;
        this.color = color;
    }

    public boolean getLight(){
        return light
    }

    public int getIntensity(){
        return intensity
    }

    public String getColor(){
        return color
    }

    public void switchLight(){
        if light == false{
            light = true;
            System.Out.println("You turned on the light");
        }
        else{
            light = false;
            System.Out.println("You turned off the light");
        }
    }

    public void switchIntensity(int n){
        if light == false{
            System.Out.println("The light is off");
            break;
        }

        if n<=1{
            intensity = 1;
        }
        else if n>=3{
            intensity = 3;
        }
        else if n == 2{
            intensity = 2;
        }
        else{
            intensity = 1;
        }
    }

    public void swithColor(int n){
        if light == false{
            System.Out.println("The light is off");
            break;
        }

        if n <= 0 || n > 3{
            color = "white";
        }
        else if n == 1{
            color = "red";
        }
        else if n == 2{
            color = "blue";
        }
        else if n == 3{
            color = "green";
        }
        else{
            color = "white";
        }
    }

}
