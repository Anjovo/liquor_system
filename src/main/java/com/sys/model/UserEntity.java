package com.sys.model;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/6/6.
 */
@Entity
@Table(name = "user", schema = "liquor_system", catalog = "")
public class UserEntity {
    private int id;
    private String nickname;
    private String password;
    private Integer tell;
    private String qq;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nickname", nullable = true, length = -1)
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "password", nullable = true, length = -1)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "tell", nullable = true)
    public Integer getTell() {
        return tell;
    }

    public void setTell(Integer tell) {
        this.tell = tell;
    }

    @Basic
    @Column(name = "qq", nullable = true, length = -1)
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (id != that.id) return false;
        if (nickname != null ? !nickname.equals(that.nickname) : that.nickname != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (tell != null ? !tell.equals(that.tell) : that.tell != null) return false;
        if (qq != null ? !qq.equals(that.qq) : that.qq != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (tell != null ? tell.hashCode() : 0);
        result = 31 * result + (qq != null ? qq.hashCode() : 0);
        return result;
    }
}
