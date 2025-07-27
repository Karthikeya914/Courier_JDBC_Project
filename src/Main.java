
import dao.SenderDAO;
import model.Sender;

public class Main {
    public static void main(String[] args) {
        SenderDAO senderDAO = new SenderDAO();
        Sender sender = new Sender("John Doe", "1234567890", "123 Main St");
        boolean success = senderDAO.addSender(sender);

        if (success) {
            System.out.println("✅ Sender inserted successfully!");
        } else {
            System.out.println("❌ Failed to insert sender.");
        }
    }
}
