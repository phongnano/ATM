package Transactions;

import Logins.DatabaseAccess;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAL_Transactions {

    private DatabaseAccess db = null;
    private Connection con = null;
    private PreparedStatement ps = null;

    public int Deposit(long amout, String usr) {
        int result = 0;
        String query = "update USERS set BALANCE = BALANCE + ? where ID = ?";
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setLong(1, amout);
            ps.setString(2, usr);
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

    public int Withdraw(long amout, String usr) {
        int result = 0;
        String query = "update USERS set BALANCE = BALANCE - ? where ID = ?";
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setLong(1, amout);
            ps.setString(2, usr);
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
