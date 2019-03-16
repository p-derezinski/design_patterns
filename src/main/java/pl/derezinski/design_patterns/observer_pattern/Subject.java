package pl.derezinski.design_patterns.observer_pattern;

public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();

}
