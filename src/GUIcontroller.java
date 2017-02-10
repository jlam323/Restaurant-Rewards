/**
 * Created by 100628824 on 2/10/2017.
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.scene.control.*;



public class GUIcontroller {

    @FXML private Label user1lbl, user2lbl, user3lbl, user4lbl, user5lbl, statuslbl;
    Database db = new Database();
    String[] customers = db.getCustomers();
    int[] points = db.getPoints();

    //adds a point to represent a transaction
    @FXML void buybtnclick(){
        statuslbl.setText("");
        db.addPoints();
        updateNames();
    }


    public void redeem3btnclick(){
        statuslbl.setText("");
        if (!db.checkPoints(3)){
            statuslbl.setText("Not enough points to redeem a drink!");
        }
        else
            updateNames();
    }

    public void redeem5btnclick(){
        statuslbl.setText("");
        if (!db.checkPoints(5)){
            statuslbl.setText("Not enough points to redeem a lunch!");
        }
        else
            updateNames();
    }

    public void redeem10btnclick(){
        statuslbl.setText("");
        if (!db.checkPoints(10)){
            statuslbl.setText("Not enough points to redeem a dinner!");
        }
        else
            updateNames();
    }

    //update the display of customers
    public void updateNames(){
        user1lbl.setText(customers[0] + "   " + points[0]);
        user2lbl.setText(customers[1] + "   " + points[1]);
        user3lbl.setText(customers[2] + "   " + points[2]);
        user4lbl.setText(customers[3] + "   " + points[3]);
        user5lbl.setText(customers[4] + "   " + points[4]);
    }
}
