package it.unibo.encapsulation;

public class TestAllClasses {
    public static void main(final String[] args) {
        final Calculator calc = new Calculator();
        System.out.println("1+2=" + calc.add(1, 2));
        Calculator.printCalculatorStatus(calc);
        System.out.println("-1-(+2)=" + calc.sub(-1, 2));
        Calculator.printCalculatorStatus(calc);
        System.out.println("8*3=" + calc.mul(8, 3));
        Calculator.printCalculatorStatus(calc);
        System.out.println("8/4=" + calc.div(8, 4));
        Calculator.printCalculatorStatus(calc);

        final Smartphone htcOne = new Smartphone("HTC", "One", 1024);
        final Smartphone note3 = new Smartphone(4, 2048, 8192, "Samsung", "Galaxy Note 3", true, true, true);
        htcOne.printStringRep();
        note3.printStringRep();

        SmartLamp lamp = new SmartLamp(true, 1, "red");
        lamp.switchLight();
        System.out.println("light is on? " + lamp.getLight());
        lamp.switchLight();
        System.out.println("light is on? " + lamp.getLight());
        lamp.switchIntensity(2);
        System.out.println("Intensity is set to: " + lamp.getIntensity());
        lamp.switchIntensity(6);
        System.out.println("Intensity is set to: " + lamp.getIntensity());
        lamp.switchIntensity(-2);
        System.out.println("Intensity is set to: " + lamp.getIntensity());
        lamp.swithColor(1);
        System.out.println("The color is set to: " + lamp.getColor());
        lamp.swithColor(4);
        System.out.println("The color is set to: " + lamp.getColor());
        lamp.swithColor(-5);
        System.out.println("The color is set to: " + lamp.getColor());
        lamp.switchLight();
        System.out.println("light is on? " + lamp.getLight());
    }
}
