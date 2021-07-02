package Controllers;

import Models.DTO_Banks;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

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
                map.put(dto.getNameBank(), dto.getIDBank());
            }
        } catch (SQLException e) {
        }
        return map;
    }
    
    public ArrayList<DTO_Banks> loadBanks(String bank) {
        ArrayList<DTO_Banks> result = new ArrayList<>();
        String query = "select IDBANK, NAMEBANK from BANKS where IDBANK = ?";
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, bank);
            rs = ps.executeQuery();
            while (rs.next()) {
                dto = new DTO_Banks();
                dto.setIDBank(rs.getString("IDBANK"));
                dto.setNameBank(rs.getString("NAMEBANK"));
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
        String query = "insert into BANKS values (?, ?)";
        
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, dto.getIDBank());
            ps.setString(2, dto.getNameBank());
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
        String query = "update BANKS set NAMEBANK = ? where IDBANK = ?";
        
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, dto.getIDBank());
            ps.setString(2, dto.getNameBank());
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
            ps.setString(1, dto.getIDBank());
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
