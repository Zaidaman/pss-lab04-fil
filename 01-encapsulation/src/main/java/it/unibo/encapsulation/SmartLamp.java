package it.unibo.encapsulation;

public class SmartLamp {

    private boolean light = false;
    private int intensity = 0;
    private String color = "white";

    public SmartLamp(boolean light, int intensity, String color){
        this.light = light;
        this.intensity = intensity;
        this.color = color;
    }

    public boolean getLight(){
        return this.light;
    }

    public int getIntensity(){
        return this.intensity;
    }

    public String getColor(){
        return this.color;
    }

    public void switchLight(){
        this.light = !this.light;
    }

    public void switchIntensity(int n){
        if light == false{
            System.Out.println("The light is off");
            break;
        }

        if n >= 1 && n <= 3{
            this.intensity = n;
        }
        else{
            this.intensity = 1;
        }
    }

    public void swithColor(int n){
        if light == false{
            System.Out.println("The light is off");
            break;
        }

        private final String[] colorPalette = ["white","red","blue","green"];

        if n <= colorPalette.lenght && n > 0{
            this.color = colorPalette[n];
        }
        else{
            this.color = "white";
        }
    }

}
