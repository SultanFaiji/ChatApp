package com.example.chatapp.ModelClass;

public class Messages {
    String messages;
    String senderId;
    long timeStamp;

    public Messages() {
    }

    public Messages(String messages, String senderId, long timeStamp) {
        this.messages = messages;
        this.senderId = senderId;
        this.timeStamp = timeStamp;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
