package GameNationBackEnd.Documents;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by tijs on 30/11/2016.
 */
@Document
public class Friend {
    @Id
    private String id;

    @DBRef
    private User sender;

    @DBRef
    private User receiver;

    private Boolean accepted;
    private Boolean sended;

    public Friend(){
        sender = new User();
        receiver = new User();
    }

    public Friend(User sender, User receiver) {
        this(sender, receiver, false);
    }

    public Friend(User sender, User receiver, boolean accepted){
        this.sender = sender;
        this.receiver = receiver;
        this.sended = true;

        this.accepted = accepted;
    }

    public User getSender() {
        return sender;
    }
    public User getReceiver() {
        return receiver;
    }
    public String getId() {
        return id;
    }
    public Boolean isAccepted(){ return accepted; }
    public Boolean getSended(){ return sended; }

    public void setAccepted(Boolean a){ this.accepted = a; }
    public void setSended(Boolean s){ this.sended = s; }

}
