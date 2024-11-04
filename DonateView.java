package com.example.donor333;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import model.Admin;
import model.Client;
import model.OtherDonation;

public class DonateView {

    @FXML
    private Button Button_1;

    @FXML
    private Button Button_2;

    @FXML
    private Button Button_3;

    @FXML
    private Button Button_4;

    @FXML
    private Label label_1;

    @FXML
    private Label label_2;

//    public DonateView() throws IOException {
//    }
//
//    public static void main(String[]args) throws IOException {
//
//        System.out.println("What do you want to donate?");
//    }

//    public void check()
//    {
//        Admin admin=new Admin();
//        admin.setAdmin();
//        for(int i=0;i<admin.clientList.size();i++)
//        {
//            Client client=new Client();
//            client=admin.clientList.get(i);
//            System.out.println(client.getName());
//        }
//    }


    static Client client15;

       public void clientinfo(Client client2)
       {
           DonateView.client15=client2;
           //client15.setName(client2.getName());
//           foodView.setinfo31(client2);
           //medicineView.setinfo42(client2);
           System.out.println(client2.getName());
       }
       static OtherDonation otherDonation=new OtherDonation();
       FoodView foodView=new FoodView();
        MedicineView medicineView=new MedicineView();
        HelloController helloController=new HelloController();

        public void tafwoera (Event event){
            //System.out.println(client15.getName()+" check");
            DonateView.otherDonation.setType("Food");
            foodView.setinfo31(client15,otherDonation);
            //foodView.setinfo32(otherDonation);
            try {
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(getClass().getResource("Food.view.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception ex) {
            System.out.println("y" + ex.getMessage());

        }

    }
    public void domedicin (Event event){
            otherDonation.setType("Medicine");
            medicineView.setinfo32(client15,otherDonation);


        try {

            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(getClass().getResource("Medicine.view.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception ex) {
            System.out.println("y" + ex.getMessage());

        }

}
    public void back (Event event){
        try {

            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(getClass().getResource("Dono.View.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception ex) {
            System.out.println("y" + ex.getMessage());

        }
}

    public void domoney (Event event){

        otherDonation.setType("Money");
        helloController.setinfo33(client15,otherDonation);

        try {

            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception ex) {
            System.out.println("y" + ex.getMessage());

        }
        }
}




