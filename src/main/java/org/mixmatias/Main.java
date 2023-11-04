package org.mixmatias;

import org.mixmatias.interfaces.CarObserved;
import org.mixmatias.interfaces.CarObserver;
import org.mixmatias.principal.PolicyCar;
import org.mixmatias.principal.StolenCar;

import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        var CarPolicy1 = new PolicyCar();
        var CarPolicy2 = new PolicyCar();

        var carStolen = new StolenCar();

        carStolen.addPolicy(CarPolicy2);

        carStolen.front();
        carStolen.front();
        carStolen.left();
        carStolen.stop();
    }
}