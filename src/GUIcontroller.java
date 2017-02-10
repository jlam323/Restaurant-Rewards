/**
 * Created by 100628824 on 2/10/2017.
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.scene.control.*;



public class GUIcontroller {

    @FXML private Label user1lbl, user2lbl, user3lbl, user4lbl, user5lbl;
    Database db = new Database();
    String[] customers = db.getCustomers();
    int[] points = db.getPoints();

    //adds a point to represent a transaction
    @FXML void buybtnclick(){
        db.addPoints();
    }


    public void redeem3btnclick(){
        if (!db.checkPoints(3)){
            //new label says cant redeem
        }
        else
            updateNames();
    }

    public void redeem5btnclick(){
        if (!db.checkPoints(5)){
            //new label says cant redeem
        }
        else
            updateNames();
    }

    public void redeem10btnclick(){
        if (!db.checkPoints(10)){
            //new label says cant redeem
        }
        else
            updateNames();
    }

    //update the display of customers
    public void updateNames(){
        user1lbl.setText(customers[0] + points[0]);
        user2lbl.setText(customers[1] + points[1]);
        user3lbl.setText(customers[2] + points[2]);
        user4lbl.setText(customers[3] + points[3]);
        user5lbl.setText(customers[4] + points[4]);
    }
}
