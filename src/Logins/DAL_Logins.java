package Logins;

import GUIS.frmAdmin;
import GUIS.frmCustomer;
import GUIS.frmStaff;
import java.sql.*;

/**
 *
 * @author nguyenphong
 */
public class DAL_Logins {

    private DatabaseAccess db = null;
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String pass;
    private int role;

    public String getPass(String usr) {
        String query = "select PASSWORD from LOGINS where USERNAME = ?";
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
        String query = "select ROLE from LOGINS where USERNAME = ?";
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
        String query = "select USERNAME, PASSWORD, ROLE from LOGINS where USERNAME = ? and PASSWORD = ?";
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, usr);
            ps.setString(2, pwd);
            rs = ps.executeQuery();
            if (rs.next()) {
                frmAdmin.usr = rs.getString("USERNAME");
                frmAdmin.pwd = rs.getString("PASSWORD");

                frmStaff.usr = rs.getString("USERNAME");
                frmStaff.pwd = rs.getString("PASSWORD");

                frmCustomer.usr = rs.getString("USERNAME");
                frmCustomer.pwd = rs.getString("PASSWORD");
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
        }
        return false;
    }

    public void ChangePassword(String usr, String oldpwd, String newpwd, String repwd) {
        String query = "update LOGINS set PASSWORD = ? where USERNAME = ?";
        String pwd = getPass(usr);
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
