package org.mixmatias.interfaces;

public interface CarObserved {
    void front();
    void right();
    void left();
    void stop();
    void addPolicy(CarObserver o);
    void notifyPolicy(String action);

}
