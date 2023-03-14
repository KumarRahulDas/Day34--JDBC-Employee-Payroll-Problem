import junit.framework.TestCase;
import org.junit.Assert;
import java.sql.Connection;
import java.sql.SQLException;

public class DBTest extends TestCase {
    static Connection a = null;

    public void testReteriveData() {
        try {
            DataBase db = new DataBase();
            a = DataBase.connected();
            String actual = DataBase.reteriveData(a);
            Assert.assertEquals("Admin", actual);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}