package Controllers;

import Models.DTO_Logins;
import java.sql.*;
import java.util.ArrayList;

public class DAL_Logins {
    
    private DatabaseAccess db = null;
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String name, pass, account;
    private int role;
    private long balance;
    
    public ArrayList<DTO_Logins> checkLogin(String usr) {
        ArrayList<DTO_Logins> result = new ArrayList<>();
        String query = "select ID, IDS, FULLNAME, BALANCE, ROLE from USERS where IDS = ?";
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, usr);
            rs = ps.executeQuery();
            while (rs.next()) {
                DTO_Logins dto = new DTO_Logins();
                dto.setAccountnumber(rs.getString("ID"));
                dto.setUsername(rs.getString("IDS"));
                dto.setFullname(rs.getString("FULLNAME"));
                dto.setBalance(rs.getLong("BALANCE"));
                dto.setRole(rs.getInt("ROLE"));
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
    
    public String getAccount(String usr) {
        String query = "select ID from USERS where IDS = ?";
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, usr);
            rs = ps.executeQuery();
            while (rs.next()) {
                account = rs.getString("ID");
            }
        } catch (SQLException e) {
        }
        return account;
    }
    
    public long getBalance(String usr) {
        String query = "select BALANCE from USERS where IDS = ?";
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, usr);
            rs = ps.executeQuery();
            while (rs.next()) {
                balance = rs.getLong("BALANCE");
            }
        } catch (SQLException e) {
        }
        return balance;
    }
    
    public String getName(String usr) {
        String query = "select FULLNAME from USERS where IDS = ?";
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, usr);
            rs = ps.executeQuery();
            while (rs.next()) {
                name = rs.getString("FULLNAME");
            }
        } catch (SQLException e) {
        }
        return name;
    }
    
    public String getPass(String usr) {
        String query = "select PASSWORD from USERS where IDS = ?";
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, usr);
            rs = ps.executeQuery();
            while (rs.next()) {
                pass = rs.getString("PASSWORD");
            }
        } catch (SQLException e) {
        }
        return pass;
    }
    
    public int getRole(String usr) {
        String query = "select ROLE from USERS where IDS = ?";
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, usr);
            rs = ps.executeQuery();
            while (rs.next()) {
                role = rs.getInt("ROLE");
            }
        } catch (SQLException e) {
        }
        return role;
    }
    
    public boolean Login(String usr, String pwd) {
        String query = "select IDS, PASSWORD from USERS where IDS = ? and PASSWORD = ?";
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, usr);
            ps.setString(2, pwd);
            rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
        }
        return false;
    }
    
    public void ChangePassword(String usr, String oldpwd, String newpwd, String repwd) {
        String query = "update USERS set PASSWORD = ? where IDS = ?";
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, newpwd);
            ps.setString(2, usr);
            ps.executeUpdate();
        } catch (SQLException e) {
        } finally {
            try {
                con.close();
                ps.close();
            } catch (SQLException e) {
            }
        }
    }
    
}
