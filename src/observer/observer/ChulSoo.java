package observer.observer;

import observer.subject.MessageSubject;

import java.util.List;

public class ChulSoo implements Observer {

    private MessageSubject subject;

    public ChulSoo(MessageSubject subject){
       this.subject = subject;
    }

    //새로운 상태에 대해 통보받는 메서드
    @Override
    public void update() {
        List<String> messages = subject.getMessageList();
        messages.stream().forEach(o->System.out.println(o));
    }
}
