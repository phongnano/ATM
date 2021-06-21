package Models;

public class DTO_Banks {

    private String idbank;
    private String nambank;

    public DTO_Banks(String idbank, String namebank) {
        this.idbank = idbank;
        this.nambank = namebank;
    }

    public DTO_Banks() {

    }

    public String getIDBank() {
        return idbank;
    }

    public void setIDBank(String idbank) {
        this.idbank = idbank;
    }

    public String getNameBank() {
        return nambank;
    }

    public void setNameBank(String nambank) {
        this.nambank = nambank;
    }

}
