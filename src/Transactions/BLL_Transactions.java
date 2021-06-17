package Transactions;

public class BLL_Transactions {

    DAL_Transactions dal = new DAL_Transactions();

    public int Deposit(long amount, String usr) {
        return dal.Deposit(amount, usr);
    }

    public int Withdraw(long amount, String usr) {
        return dal.Withdraw(amount, usr);
    }
    
    public int Transfer(long amount, String send_usr, String receive_usr) {
        return dal.Transfer(amount, send_usr, receive_usr);
    }
}
