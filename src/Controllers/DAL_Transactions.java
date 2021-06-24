package Controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAL_Transactions {

    private DatabaseAccess db = null;
    private Connection con = null;
    private PreparedStatement ps = null;

    public int Deposit(long amount, String usr) {
        int result = 0;
        String query = "update USERS set BALANCE = ? where ACCOUNT = ?";
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setLong(1, amount);
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

    public int Withdraw(long amount, String usr) {
        int result = 0;
        String query = "update USERS set BALANCE = ? where ACCOUNT = ?";
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setLong(1, amount);
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

    public int Transfer(long amount, String send_usr, String receive_usr) {
        int result = 0;
        String query_send = "update USERS set BALANCE = BALANCE - ? where ACCOUNT = ?";
        String query_receive = "update USERS set BALANCE = BALANCE + ? where ACCOUNT = ?";
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query_send);
            ps.setLong(1, amount);
            ps.setString(2, send_usr);
            result = ps.executeUpdate();

            ps = con.prepareStatement(query_receive);
            ps.setLong(1, amount);
            ps.setString(2, receive_usr);
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
