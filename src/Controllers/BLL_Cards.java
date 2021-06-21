package Controllers;

import Models.DTO_Cards;

public class BLL_Cards {

    DAL_Cards dal = new DAL_Cards();

    public int AddCard(DTO_Cards dto) {
        int result = dal.addCard(dto);
        return result;
    }
}
