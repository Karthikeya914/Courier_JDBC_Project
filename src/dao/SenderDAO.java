
package dao;

import db.DBConnection;
import model.Sender;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class SenderDAO {
    public boolean addSender(Sender sender) {
        String sql = "INSERT INTO Senders (name, contact_number, address) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, sender.getName());
            stmt.setString(2, sender.getContactNumber());
            stmt.setString(3, sender.getAddress());

            int rows = stmt.executeUpdate();
            return rows > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
