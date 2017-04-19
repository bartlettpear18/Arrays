package com.company;

/**
 * Created by Joel.Bartlett18 on 4/18/2017.
 */
public class Science15 {
    private int k;
    private int mass;
    private double displacement;
    private double velocity;
    private double acceleration;
    private double time;
    private final double timeInt = 0.01;
    private double numInt;

    public Science15() {
        k = 10;
        mass = 1;
        displacement = 0.5;
        velocity = 0.0;
        calcAcc();
        numInt = 10;
    }

    private double calcAcc() {
        acceleration = (k * displacement)/mass;
        return acceleration;
    }

    private double calcVel() {
        velocity = acceleration * timeInt;
        return velocity;
    }

    private double calcDis() {
        displacement = velocity * timeInt;
        return displacement;
    }

    public void graph() {
        for (int i = 0; i < numInt; i++) {
            time += timeInt;
            calcAcc();
            calcVel();
            calcDis();
        }

    }
}
