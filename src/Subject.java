public interface Subject {
    void addObserver(Observer obj);
    void removeObserver(Observer obj);
    void notifyObserver();
}
