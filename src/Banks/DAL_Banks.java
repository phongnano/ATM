package Banks;

import Logins.DatabaseAccess;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAL_Banks {

    private DatabaseAccess db = null;
    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement ps = null;

    public ArrayList<DTO_Banks> loadBanks() {
        ArrayList<DTO_Banks> result = new ArrayList<>();
        String query = "select IDBANK, NAMEBANK from BANKS";
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                DTO_Banks dto = new DTO_Banks();
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
