package Logins;

public class DTO_Logins {

    private String username;
    private String passwowd;
    private String newpassword;
    private String repassword;
    private int role;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswowd() {
        return passwowd;
    }

    public void setPasswowd(String passwowd) {
        this.passwowd = passwowd;
    }

    public String getNewpassword() {
        return newpassword;
    }

    public void setNewpassword(String newpassword) {
        this.newpassword = newpassword;
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

}
