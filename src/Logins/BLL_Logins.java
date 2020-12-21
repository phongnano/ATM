package Logins;

public class BLL_Logins {

    DAL_Logins dal = new DAL_Logins();

    public boolean SLogins(DTO_Logins dto) {
        return dal.SLogin(dto.getUsername(), dto.getPasswowd());
    }

    public boolean CLogins(DTO_Logins dto) {
        return dal.CLogin(dto.getUsername(), dto.getPasswowd());
    }

    public void ChangePasswords(DTO_Logins dto) {
        dal.ChangePassword(dto.getUsername(), dto.getPasswowd(), dto.getNewpassword(), dto.getRepassword());
    }
}
