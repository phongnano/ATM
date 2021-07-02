package Controllers;

import Models.DTO_Banks;
import java.util.ArrayList;
import java.util.HashMap;

public class BLL_Banks {

    DAL_Banks dal = new DAL_Banks();

    public HashMap<String, String> getBank(String bank) {
        return dal.getBank(bank);
    }

    public ArrayList<DTO_Banks> loadBanks(String bank) {
        return dal.loadBanks(bank);
    }

    public int addBanks(DTO_Banks dto) {
        int result = dal.addBanks(dto);
        return result;
    }

    public int editBanks(DTO_Banks dto) {
        int result = dal.editBanks(dto);
        return result;
    }

    public int deleteBanks(DTO_Banks dto) {
        int result = dal.deleteBanks(dto);
        return result;
    }

}
