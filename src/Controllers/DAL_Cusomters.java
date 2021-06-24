package Controllers;

import Models.DTO_Customers;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAL_Cusomters {

    private DatabaseAccess db = null;
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private long amount;

    public ArrayList<DTO_Customers> CheckBalance(String usr) {
        ArrayList<DTO_Customers> result = new ArrayList<>();
        String query = "select ACCOUNT, FULLNAME, BALANCE from USERS where IDS = ? and ROLE = 2";
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, usr);
            rs = ps.executeQuery();
            while (rs.next()) {
                DTO_Customers dto = new DTO_Customers();
                dto.setAccount(rs.getString("ACCOUNT"));
                dto.setFullname(rs.getString("FULLNAME"));
                dto.setBalance(rs.getLong("BALANCE"));
                result.add(dto);
            }
        } catch (SQLException e) {
        } finally {
            try {
                con.close();
                ps.close();
                rs.close();
            } catch (SQLException e) {
            }
        }
        return result;
    }

    public boolean checkID(String acc) {
        String query = "select ACCOUNT from USERS where ACCOUNT = ? and ROLE = 2";
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, acc);
            rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
        }
        return false;
    }

    public long getBalance(String usr) {
        String query = "select BALANCE from USERS where ACCOUNT = ? and ROLE =2";
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, usr);
            rs = ps.executeQuery();
            while (rs.next()) {
                amount = rs.getLong("BALANCE");
            }
        } catch (SQLException e) {
        }
        return amount;
    }

    public int insertCustomer(String idcard, String idaccount, Date startday, Date endday, String idbank, String typecard, String pin, String idcust, String id, String fullname, Date birthday, int gender, String nativeplace, String telephone, String password, String account, long balance, int role, String bank) {
        int result = 0;

        String query_card = "insert into CARDS values (?, ?, ?, ?, ?, ?, ?)";
        String query_customer = "insert into USERS (IDS, ID, FULLNAME, BIRTHDAY, GENDER, NATIVEPLACE, TELEPHONE, PASSWORD, ACCOUNT, BALANCE, ROLE, IDBANK) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query_card);
            ps.setString(1, idcard);
            ps.setString(2, idaccount);
            ps.setDate(3, startday);
            ps.setDate(4, endday);
            ps.setString(5, idbank);
            ps.setString(6, typecard);
            ps.setString(7, pin);
            result = ps.executeUpdate();

            ps = con.prepareStatement(query_customer);
            ps.setString(1, idcust);
            ps.setString(2, id);
            ps.setString(3, fullname);
            ps.setDate(4, birthday);
            ps.setInt(5, gender);
            ps.setString(6, nativeplace);
            ps.setString(7, telephone);
            ps.setString(8, password);
            ps.setString(9, account);
            ps.setLong(10, balance);
            ps.setInt(11, role);
            ps.setString(12, bank);
            result = ps.executeUpdate();
        } catch (SQLException e) {
        } finally {
            try {
                con.close();
                ps.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
        return result;
    }
}
