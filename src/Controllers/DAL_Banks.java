package Controllers;

import Models.DTO_Banks;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class DAL_Banks {

    private DatabaseAccess db = null;
    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement ps = null;
    private DTO_Banks dto = null;

    public HashMap<String, String> getBank(String bank) {
        HashMap<String, String> map = new HashMap<>();
        String query = "select bnk.IDBANK, bnk.NAMEBANK from BANKS bnk,USERS usr where bnk.IDBANK = usr.IDBANK and usr.IDBANK = ?";
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, bank);
            rs = ps.executeQuery();
            while (rs.next()) {
                dto = new DTO_Banks(rs.getString("IDBANK"), rs.getString("NAMEBANK"));
                map.put(dto.getNambank(), dto.getIdbank());
            }
        } catch (SQLException e) {
        }
        return map;
    }

    public boolean getLogobank(JLabel lblLogo) {
        String query = "select LOGOBANK from BANKS where IDBANK = ?";
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ResultSet result = ps.executeQuery();
            if (result.next()) {
                byte logobank[] = result.getBytes("LOGOBANK");
                if (logobank == null) {
                } else {
                    ImageIcon icon = new ImageIcon(logobank);
                    Image img = icon.getImage();
                    Image newImg = img.getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon newIcon = new ImageIcon(newImg);
                    lblLogo.setIcon(newIcon);
                }
            } else {
                System.err.println("Không tìm thấy ảnh");
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
        return false;
    }

    public ArrayList<DTO_Banks> loadBanks(String bank) {
        ArrayList<DTO_Banks> result = new ArrayList<>();
        String query = "select IDBANK, NAMEBANK, LOGOBANK from BANKS where IDBANK = ?";
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, bank);
            rs = ps.executeQuery();
            while (rs.next()) {
                dto = new DTO_Banks(rs.getString("IDBANK"), rs.getString("NAMEBANK"), rs.getBytes("LOGOBANK"));
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

    public ArrayList<DTO_Banks> loadBanks() {
        ArrayList<DTO_Banks> result = new ArrayList<>();
        String query = "select IDBANK, NAMEBANK, LOGOBANK from BANKS";
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                dto = new DTO_Banks(rs.getString("IDBANK"), rs.getString("NAMEBANK"), rs.getBytes("LOGOBANK"));
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

    public int addBanks(DTO_Banks dto) {
        int result = 0;
        String query = "insert into BANKS values (?, ?, ?)";

        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, dto.getIdbank());
            ps.setString(2, dto.getNambank());
            ps.setBytes(3, dto.getLogobank());
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

    public int editBanks(DTO_Banks dto) {
        int result = 0;
        String query = "update BANKS set LOGOBANK = ? where IDBANK = ?";

        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setBytes(1, dto.getLogobank());
            ps.setString(2, dto.getIdbank());
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

    public int deleteBanks(DTO_Banks dto) {
        int result = 0;
        String query = "delete from BANKS where IDBANK = ?";

        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, dto.getIdbank());
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
