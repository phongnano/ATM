package Logins;

import java.sql.*;

public class DAL_Logins {

    private DatabaseAccess db = null;
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String name;
    private int role;

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
        String query = "update LOGINS set PASSWORD = ? where USERNAME = ?";
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
