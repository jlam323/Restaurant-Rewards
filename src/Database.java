/**
 *
 */
public class Database {

    String customers[];
    int points[];

    final int NUM_CUSTOMERS = 5;    //total number of customers. unused for now
    final int CURRENT_USER = 2;     //position of the demo-er in the array

    //default constructor to populate the database with preset names and points
    public Database(){
        customers = new String[] {"Bob", "Joe", "Heusen", "George", "Alex"};
        points = new int[] {1, 3, 5, 3, 0};
    }

    //adds a default 1 point to represent a customer visit/purchase
    public void addPoints(){
        points[CURRENT_USER]++;
    }

    //removes points to represent a customer claiming a reward
    public void subPoints(int rewardPoints){
        points[CURRENT_USER] = points[CURRENT_USER] - rewardPoints;
    }

    //checks if the customer has enough points to claim a reward
    public boolean checkPoints(int rewardPoints){
        if (points[CURRENT_USER] < rewardPoints){
            return false;
        }
        else{
            subPoints(rewardPoints);
            return true;
        }
    }

    public String[] getCustomers(){
        return customers;
    }

    public int[] getPoints(){
        return points;
    }
}
