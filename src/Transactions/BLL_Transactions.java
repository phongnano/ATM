package Transactions;

import Customers.DTO_Customers;

public class BLL_Transactions {

    DAL_Transactions dal = new DAL_Transactions();

    public double Deposit(DTO_Customers dto) {
        return dal.Deposit(dto);
    }
}
