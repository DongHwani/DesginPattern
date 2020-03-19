package observer.observer;

import observer.subject.MessageSubject;

import java.util.List;

public class Mina implements Observer {

    private MessageSubject messageSubject;

    public Mina(MessageSubject messageSubject) {
        this.messageSubject = messageSubject;
    }

    @Override
    public void update() {
        List<String> messages = messageSubject.getMessageList();
        messages.stream().forEach(o->System.out.println(o));
    }

}
