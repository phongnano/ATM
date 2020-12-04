package Banks;

import java.util.ArrayList;

public class BLL_Banks {

    DAL_Banks dal = new DAL_Banks();

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
