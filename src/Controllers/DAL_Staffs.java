package Controllers;

import Models.DTO_Staffs;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAL_Staffs {

    private DatabaseAccess db = null;
    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement ps = null;

    public ArrayList<DTO_Staffs> loadStaffs() {
        ArrayList<DTO_Staffs> result = new ArrayList<>();
        String query = "select usr.IDS, usr.ID, usr.FULLNAME, usr.GENDER, usr.NATIVEPLACE, usr.BIRTHDAY, usr.TELEPHONE, bnk.NAMEBANK from BANKS bnk, USERS usr where bnk.IDBANK = usr.IDBANK and usr.ROLE = 1";
        try {
            db = new DatabaseAccess();
            con = db.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                DTO_Staffs dto = new DTO_Staffs();
                dto.setIdstaff(rs.getString("IDS"));
                dto.setId(rs.getString("ID"));
                dto.setFullname(rs.getString("FULLNAME"));
                dto.setGender(rs.getInt("GENDER"));
                dto.setNativeplace(rs.getString("NATIVEPLACE"));
                dto.setBirthday(rs.getDate("BIRTHDAY"));
                dto.setTelephone(rs.getString("TELEPHONE"));
                dto.setNamebank(rs.getString("NAMEBANK"));
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
