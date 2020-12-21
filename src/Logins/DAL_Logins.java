package Logins;

import GUIS.frmAdmin;
import GUIS.frmCustomer;
import GUIS.frmStaff;
import java.sql.*;

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

    public int getSRole(String usr) {
        String query = "select ROLE from STAFFS where IDSTAFF = ?";
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

    public int getCRole(String usr) {
        String query = "select ROLE from CUSTOMERS where IDCUST = ?";
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

    public boolean SLogin(String usr, String pwd) {
        String query = "select IDSTAFF, PASSWORD, ROLE from STAFFS where IDSTAFF = ? and PASSWORD = ? and ROLE = ?";
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, usr);
            ps.setString(2, pwd);
            ps.setInt(3, role);
            rs = ps.executeQuery();
            if (rs.next()) {
                if (role == 0) {
                    frmAdmin.usr = rs.getString("IDSTAFF");
                    frmAdmin.pwd = rs.getString("PASSWORD");
                }

                if (role == 1) {
                    frmStaff.usr = rs.getString("IDSTAFF");
                    frmStaff.pwd = rs.getString("PASSWORD");
                }
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
        }
        return false;
    }

    public boolean CLogin(String usr, String pwd) {
        String query = "select IDCUST, PASSWORD, ROLE from CUSTOMERS where IDCUST = ? and PASSWORD = ? and ROLE = ?";
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, usr);
            ps.setString(2, pwd);
            ps.setInt(3, role);
            rs = ps.executeQuery();
            if (rs.next()) {
                switch (role) {
                    case 2: {
                        frmCustomer.usr = rs.getString("IDCUST");
                        frmCustomer.pwd = rs.getString("PASSWORD");
                        break;
                    }
                }
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
