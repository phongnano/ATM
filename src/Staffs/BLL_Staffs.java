package Staffs;

import java.util.ArrayList;

public class BLL_Staffs {

    DAL_Staffs dal = new DAL_Staffs();

    public ArrayList<DTO_Staffs> loadStaffs() {
        return dal.loadStaffs();
    }

}
