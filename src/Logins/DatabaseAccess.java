package Logins;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nguyenphong
 */
public class DatabaseAccess {

    private String url = null;
    private String usr = null;
    private String pwd = null;
    private String dvr = null;

    private Connection con;

    public Connection getConnection() {
        Properties pro = new Properties();
        try {
            pro.load(new FileInputStream("database.properties"));
            url = pro.getProperty("db_url");
            usr = pro.getProperty("db_usr");
            pwd = pro.getProperty("db_pwd");
            dvr = pro.getProperty("db_dvr");
            Class.forName(dvr);
            con = DriverManager.getConnection(url, usr, pwd);
        } catch (FileNotFoundException e) {
            System.err.println("Không tìm thấy tệp tin database.properties: " + e);
        } catch (IOException e) {
            System.err.println("Có lỗi khi thao tác với tệp tin: " + e);
        } catch (ClassNotFoundException e) {
            System.err.println("Không tim thấy class: " + e);
        } catch (SQLException e) {
            System.err.println("Lỗi kết nối cơ sở dữ liệu: " + e);
        }
        if (con == null) {
            throw new NullPointerException("Kết nối không thành công");
        }
        return con;
    }
}
