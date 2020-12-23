package Transactions;

import Customers.DTO_Customers;
import Logins.DatabaseAccess;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAL_Transactions {

    private DatabaseAccess db = null;
    private Connection con = null;
    private PreparedStatement ps = null;

    public double Deposit(DTO_Customers dto) {
        int result = 0;
        String query = "insert into USERS values (?)";
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setDouble(1, dto.getAmount());
            result = ps.executeUpdate();
        } catch (SQLException e) {
        } finally {
            try {
                con.close();
                ps.close();
            } catch (SQLException e) {
            }
        }
        return result;
    }
}
