package com.common.Test7;

/**
 * @Author: nxw
 * @Date: 2020/4/17 19:31
 */
public class User {
    private String name;
    private String passwd;
    private String nick;
    private String chineseName;
    private String tele;
    private String email;

    public User(String name, String passwd, String nick, String chineseName, String tele, String email) {
        this.name = name;
        StringBuilder sec = new StringBuilder(passwd);
        passwd = sec.append("@.").toString();
        this.passwd = passwd;
        this.nick = nick;
        this.chineseName = chineseName;
        this.tele = tele;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
