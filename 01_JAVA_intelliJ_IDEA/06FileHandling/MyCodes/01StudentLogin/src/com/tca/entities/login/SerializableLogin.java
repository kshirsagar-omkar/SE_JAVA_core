package com.tca.entities.login;

import java.io.Serial;
import java.io.Serializable;

public class SerializableLogin implements Serializable {

    private String userName;
    private String password;

    @Serial
    private static final transient long serialVersionUID;

    static {
        serialVersionUID = 19L;
    }

    public  SerializableLogin(){}

    public SerializableLogin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "SerializableLogin{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
