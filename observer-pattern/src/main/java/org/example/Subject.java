package org.example;

public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer observer);

    void notifyObservers();
}
