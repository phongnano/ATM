package Customers;

public class BLL_Customers {

    DAL_Cusomters dal = new DAL_Cusomters();

    public boolean CheckID(DTO_Customers dto) {
        return dal.checkID(dto.getId());
    }

    public int AddCustomer(DTO_Customers dto) {
        int result = dal.addCustomers(dto);
        return result;
    }
}
