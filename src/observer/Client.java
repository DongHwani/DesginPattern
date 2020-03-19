package observer;

import observer.observer.ChulSoo;
import observer.observer.Mina;
import observer.subject.MessageSubject;

public class Client {
    public static void main(String[] args) {
        MessageSubject messageSubject = new MessageSubject();

        ChulSoo chulSoo = new ChulSoo(messageSubject);
        Mina mina = new Mina(messageSubject);

        messageSubject.enter(chulSoo);
        messageSubject.enter(mina);

        messageSubject.addMessage("메세지 신규 등록");
    }
}
