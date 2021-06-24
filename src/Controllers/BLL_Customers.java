package Controllers;

import Models.DTO_Customers;
import java.sql.Date;
import java.util.ArrayList;

public class BLL_Customers {

    DAL_Cusomters dal = new DAL_Cusomters();

    public ArrayList<DTO_Customers> CheckBalance(String usr) {
        return dal.CheckBalance(usr);
    }

    public boolean CheckID(DTO_Customers dto) {
        return dal.checkID(dto.getAccount());
    }

    public int insertCustomer(String idcard, String idaccount, Date startday, Date endday, String idbank, String typecard, String pin, String idcust, String id, String fullname, Date birthday, int gender, String nativeplace, String telephone, String password, String account, long balance, int role, String bank) {
        return dal.insertCustomer(idcard, idaccount, startday, endday, idbank, typecard, pin, idcust, id, fullname, birthday, gender, nativeplace, telephone, password, account, balance, role, bank);
    }
}
