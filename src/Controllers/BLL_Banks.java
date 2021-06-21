package Controllers;

import Models.DTO_Banks;
import java.util.ArrayList;
import java.util.HashMap;

public class BLL_Banks {

    DAL_Banks dal = new DAL_Banks();

    public HashMap<String, String> getBank() {
        return dal.getBank();
    }

    public ArrayList<DTO_Banks> loadBanks() {
        return dal.loadBanks();
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
