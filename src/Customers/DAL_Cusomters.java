package Customers;

import Logins.DatabaseAccess;
import java.sql.Connection;
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
        String query = "select ID, FULLNAME, BALANCE from USERS where IDS = ? and ROLE = 2";
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, usr);
            rs = ps.executeQuery();
            while (rs.next()) {
                DTO_Customers dto = new DTO_Customers();
                dto.setAccount(rs.getString("ID"));
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

    public boolean checkID(String usr) {
        String query = "select ID from USERS where ID = ? and ROLE = 2";
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, usr);
            rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
        }
        return false;
    }

    public long getBalance(String usr) {
        String query = "select BALANCE from USERS where ID = ? and ROLE =2";
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

    public int addCustomers(DTO_Customers dto) {
        int result = 0;
        String query = "insert into USERS values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, dto.getId());
            ps.setString(2, dto.getIdcust());
            ps.setString(3, dto.getFullname());
            ps.setDate(4, dto.getBirthday());
            ps.setInt(5, dto.getGender());
            ps.setString(6, dto.getNativeplace());
            ps.setString(7, dto.getTelephone());
            ps.setString(8, dto.getPassword());
            ps.setInt(9, dto.getRole());
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
