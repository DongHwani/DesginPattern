package observer.subject;

import observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class RoomSubject {

    private List<Observer> observerList = new ArrayList<>();

    //관찰자(Observer)를 추가
    public void enter(Observer observer) {
        observerList.add(observer);
    }

    //관찰자(Observer)를 제거
    public void exit(Observer observer) {
        observerList.remove(observer);
    }

    //방에 입장한 모든 유저(관찰자)에게 상태변경을 통지
    public void announce() {
        observerList.forEach(Observer::update);
    }
}