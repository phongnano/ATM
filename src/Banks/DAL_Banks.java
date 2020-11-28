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
    private final DTO_Banks dto = new DTO_Banks();
    private final ArrayList<DTO_Banks> result = new ArrayList<>();

    public ArrayList<DTO_Banks> loadBanks() {
        String query = "select * from BANKS";
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
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
}
