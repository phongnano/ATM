package Customers;

import Logins.DatabaseAccess;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAL_Cusomters {

    private DatabaseAccess db = null;
    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement ps = null;

    public int addCustomers(DTO_Customers dto) {
        int result = 0;
        String query = "insert into CUSTOMERS values (?, ?)";

        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, dto.getId());
            ps.setString(2, dto.getIdcust());
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
