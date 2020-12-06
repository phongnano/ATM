package Cards;

import java.util.Date;

public class DTO_Cards {

    private String idcard;
    private String idacco;
    private Date sttday;
    private Date endday;

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

}
