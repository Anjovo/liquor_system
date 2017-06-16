package com.sys.model;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/6/6.
 */
@Entity
@Table(name = "message", schema = "liquor_system", catalog = "")
public class MessageEntity {
    private int id;
    private Integer userTell;
    private String userName;
    private String message;
    private String mailbox;
    private String operator;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_tell", nullable = true)
    public Integer getUserTell() {
        return userTell;
    }

    public void setUserTell(Integer userTell) {
        this.userTell = userTell;
    }

    @Basic
    @Column(name = "user_name", nullable = true, length = -1)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "message", nullable = true, length = -1)
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Basic
    @Column(name = "mailbox", nullable = true, length = -1)
    public String getMailbox() {
        return mailbox;
    }

    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }

    @Basic
    @Column(name = "operator", nullable = true, length = -1)
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MessageEntity that = (MessageEntity) o;

        if (id != that.id) return false;
        if (userTell != null ? !userTell.equals(that.userTell) : that.userTell != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (message != null ? !message.equals(that.message) : that.message != null) return false;
        if (mailbox != null ? !mailbox.equals(that.mailbox) : that.mailbox != null) return false;
        if (operator != null ? !operator.equals(that.operator) : that.operator != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userTell != null ? userTell.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (mailbox != null ? mailbox.hashCode() : 0);
        result = 31 * result + (operator != null ? operator.hashCode() : 0);
        return result;
    }
}
