package org.mixmatias.principal;

import org.mixmatias.interfaces.CarObserver;
import org.mixmatias.interfaces.CarObserved;

import java.util.ArrayList;
import java.util.List;

public class StolenCar implements CarObserved {

    private List<CarObserver> policyCars = new ArrayList<>();

    @Override
    public void front() {
        System.out.println("Carro roubado seguiu em frente");
        notifyPolicy("frente");
    }

    @Override
    public void right() {
        System.out.println("Carro roubado virou a direita");
        notifyPolicy("direita");
    }

    @Override
    public void left() {
        System.out.println("Carro roubado virou a esquerda");
        notifyPolicy("esquerda");

    }

    @Override
    public void stop() {
        System.out.println("Carro roubado parou");
        notifyPolicy("Para");
    }

    @Override
    public void addPolicy(CarObserver o) {
        policyCars.add(o);
    }

    public void notifyPolicy(String action){
        for (CarObserver policy : policyCars) {
            policy.follow(action);
        }
    }

}
