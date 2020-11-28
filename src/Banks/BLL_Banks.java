package Banks;

import java.util.ArrayList;

public class BLL_Banks {

    DAL_Banks dal = new DAL_Banks();

    public ArrayList<DTO_Banks> loadBanks() {
        return dal.loadBanks();
    }
}
