package Controllers;

import Models.DTO_Staffs;
import java.sql.Date;
import java.util.ArrayList;

public class BLL_Staffs {

    DAL_Staffs dal = new DAL_Staffs();

    public ArrayList<DTO_Staffs> loadStaffs() {
        return dal.loadStaffs();
    }

    public int insertStaff(String idstaff, String id, String fullname, Date birthday, int gender, String nativeplace, String telephone, String password, int role, String bank) {
        return dal.insertStaff(idstaff, id, fullname, birthday, gender, nativeplace, telephone, password, role, bank);
    }
}
