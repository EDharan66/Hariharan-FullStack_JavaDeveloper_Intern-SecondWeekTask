package Subject;

import Observer.Observer;

public interface Subject {


    public void register(Observer obj);
    public void notifyObservers();
    public void unRegister(Observer obj);
    public Object getUpdate(Observer obj);
}
