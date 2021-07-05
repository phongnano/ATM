package Models;

import java.io.InputStream;

public class DTO_Banks {

    private String idbank;
    private String nambank;
    private InputStream logobank;

    public String getIdbank() {
        return idbank;
    }

    public void setIdbank(String idbank) {
        this.idbank = idbank;
    }

    public String getNambank() {
        return nambank;
    }

    public void setNambank(String nambank) {
        this.nambank = nambank;
    }

    public InputStream getLogobank() {
        return logobank;
    }

    public void setLogobank(InputStream logobank) {
        this.logobank = logobank;
    }

    public DTO_Banks(String idbank, String namebank) {
        this.idbank = idbank;
        this.nambank = namebank;
    }

    public DTO_Banks() {

    }

}
