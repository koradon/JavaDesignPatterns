package observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by mics on 4/5/16.
 */
public class Subject implements SubjectInterface{
    private ArrayList<ObserverInterface> observers;
    private double data;

    public Subject() {
        observers = new ArrayList();
    }

    public void setData(double data) {
        this.data = data;
        changeData();
    }

    public void changeData(){
        notifyObservers();
    }

    @Override
    public void addObserver(ObserverInterface o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(ObserverInterface o) {
        int i = observers.indexOf(o);
        if(i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers(){
        for(ObserverInterface observer : observers){
            observer.update(data);
        }
    }

    /*
    public void notify2Observers() {
        for(int i=0; i<=observers.size(); i++){
            Observer o = (Observer)observers.get(i);
            o.update(data);
        }
    }
    */
}
