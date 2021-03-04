package Server;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Message implements Serializable {
    private String userName;
    private String text;
    private LocalDateTime sendAt;

    public Message(String userName, String text) {
        this.userName = userName;
        this.text = text;
       sendAt=LocalDateTime.now();
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setSendAt(LocalDateTime sendAt) {
        this.sendAt = sendAt;
    }

    public String getUserName() {
        return userName;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getSendAt() {
        return sendAt;
    }

    @Override
    public String toString() {
        return "Message{" +
                "userName='" + userName + '\'' +
                ", text='" + text + '\'' +
                ", sendAt=" + sendAt +
                '}';
    }
}
