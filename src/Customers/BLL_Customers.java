package Customers;

import java.util.ArrayList;

public class BLL_Customers {

    DAL_Cusomters dal = new DAL_Cusomters();
    
    public ArrayList<DTO_Customers> CheckBalance(String usr) {
        return dal.CheckBalance(usr);
    }

    public boolean CheckID(DTO_Customers dto) {
        return dal.checkID(dto.getId());
    }

    public int AddCustomer(DTO_Customers dto) {
        int result = dal.addCustomers(dto);
        return result;
    }
}
