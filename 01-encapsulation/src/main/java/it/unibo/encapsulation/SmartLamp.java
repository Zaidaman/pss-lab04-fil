package it.unibo.encapsulation;

public class SmartLamp {

    // color palette inizialization as a private static array
    private final static String[] COLOR_PALETTE = { "white", "red", "blue", "green" };

    // inizialization of variables
    private boolean lightIsOn = false;
    private int intensity = 1;
    private String color = "white";

    public SmartLamp(boolean light, int intensity, String color) {
        this.lightIsOn = lightIsOn;
        this.intensity = intensity;
        this.color = color;
    }

    // function that retuns various status of the of the lamp
    public boolean getLight() {
        return this.lightIsOn;
    }

    public int getIntensity() {
        return this.intensity;
    }

    public String getColor() {
        return this.color;
    }

    // function to switch on or off the lamp, based on his current status
    public void switchLight() {
        this.lightIsOn = !this.lightIsOn;
    }

    // switch intensity of the light by taking in input a number from 1 to 3
    // if the light is off(false) nothing will change, if the number is out of
    // the range will put the closer intensity
    public void switchIntensity(int n) {
        if (this.lightIsOn == true) {
            if (n >= 1 && n <= 3) {
                this.intensity = n;
            } else if (n > 3) {
                this.intensity = 3;
            } else {
                this.intensity = 1;
            }
        }
    }

    // switch color based on the color palette and the number n, if the light is
    // off(false) nothing will change, if n is in the range of the color palette
    // lenght the new color will be assigned, otherwise it will assign white
    public void swithColor(int n) {
        if (this.lightIsOn == true) {
            if (n <= COLOR_PALETTE.length && n > 0) {
                this.color = COLOR_PALETTE[n - 1];
            } else {
                this.color = COLOR_PALETTE[0];
            }
        }
    }

}
