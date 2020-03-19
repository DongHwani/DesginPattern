package observer.subject;

import java.util.ArrayList;
import java.util.List;

public class MessageSubject extends RoomSubject {

    private List<String> messageList = new ArrayList<>();

    //새로운 메세지가 등록이 되면, 모든 감시자들에게 상태변화를 알린다.
    public void addMessage(String message){
        messageList.add(message);
        announce();
    }

    public List<String> getMessageList(){
        return messageList;
    }
}
