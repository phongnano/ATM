package Cards;

import Logins.DatabaseAccess;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAL_Cards {

    private DatabaseAccess db = null;
    private Connection con = null;
    private PreparedStatement ps = null;

    public int addCard(DTO_Cards dto) {
        int result = 0;
        String query = "insert into CARDS values (?, ?, ?, ?, ?, ?)";
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, dto.getIdcard());
            ps.setString(2, dto.getIdacco());
            ps.setDate(3, dto.getSttday());
            ps.setDate(4, dto.getEndday());
            ps.setString(5, dto.getTypecard());
            ps.setString(6, dto.getIdcard());
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
