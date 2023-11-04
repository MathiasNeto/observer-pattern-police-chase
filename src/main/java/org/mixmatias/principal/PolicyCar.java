package org.mixmatias.principal;

import org.mixmatias.interfaces.CarObserved;
import org.mixmatias.interfaces.CarObserver;

public class PolicyCar implements CarObserver {
    @Override
    public void follow(String action) {
        switch (action) {
            case "esquerda" -> System.out.println("Viatura vira a esquerda");
            case "direita" -> System.out.println("Viatura vira a direita");
            case "frente" -> System.out.println("Viatura segue em frente");
            case "Para" -> System.out.println("Viatura para");
            default -> System.err.println("acao invalida");
        }
    }

//    @Override
//    public void front() {
//        System.out.println("VAI EM FRENTE");
//    }
//
//    @Override
//    public void right() {
//        System.out.println("VAI PARA DIREITA");
//    }
//
//    @Override
//    public void left() {
//        System.out.println("VAI PARA ESQUERDA");
//    }
//
//    @Override
//    public void stop() {
//        System.out.println("PARE");
//    }
//
//    @Override
//    public void follow(String action) {
//
//    }

//    public void updateRoute(String action){
//        switch (action) {
//            case "Frente" -> this.front();
//            case "Esquerda" -> this.left();
//            case "Direita" -> this.right();
//            default -> this.stop();
//        }
//    }
}
