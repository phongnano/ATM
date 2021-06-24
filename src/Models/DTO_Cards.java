package Models;

import java.sql.Date;

public class DTO_Cards {

    private String idcard;
    private String idacco;
    private Date sttday;
    private Date endday;
    private String idbank;
    private String typecard;
    private String pin;

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getIdacco() {
        return idacco;
    }

    public void setIdacco(String idacco) {
        this.idacco = idacco;
    }

    public Date getSttday() {
        return sttday;
    }

    public void setSttday(Date sttday) {
        this.sttday = sttday;
    }

    public Date getEndday() {
        return endday;
    }

    public void setEndday(Date endday) {
        this.endday = endday;
    }

    public String getIdbank() {
        return idbank;
    }

    public void setIdbank(String idbank) {
        this.idbank = idbank;
    }

    public String getTypecard() {
        return typecard;
    }

    public void setTypecard(String typecard) {
        this.typecard = typecard;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

}
