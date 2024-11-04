package com.example.donor333;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.OperationRoom;

import java.util.ArrayList;
import java.util.List;

public class OperationRoomController {

    @FXML
    private ImageView Background;

    @FXML
    private GridPane Grid;

    @FXML
    private ScrollPane Scroll;

    @FXML
    private Text Title;

    @FXML
    private VBox Vbox;

    @FXML
    private Button Back;


    @FXML
    private void initialize() {
        List<OperationRoom> operationRooms = getData();
        createGridPane();
        addOperationRoomsToGridPane(operationRooms);
    }

    private List<OperationRoom> getData() {
        ArrayList<OperationRoom> operationRooms = new ArrayList<>();

        // Create operation rooms
        for (int i = 1; i <= 3; i++) {
            OperationRoom room = new OperationRoom(i);
            operationRooms.add(room);
        }

        // Add slots to each room
        for (OperationRoom room : operationRooms) {
            for (int i = 1; i <= 10; i++) {
                room.addSlot("Slot " + i);
            }
        }

        return operationRooms;
    }

    private void createGridPane() {
        // Customize grid pane properties if needed
        Grid.setAlignment(Pos.CENTER);
        Grid.setHgap(500);
        Grid.setVgap(20);

        Grid.getColumnConstraints().clear();

    }


    private void addOperationRoomsToGridPane(List<OperationRoom> operationRooms) {
        int row = 1;

        // Add header Texts for Operation Rooms and Slots
        Label roomHeader = new Label("Operation Rooms");
        roomHeader.setFont(Font.font("Times new roman", FontWeight.BOLD, 35));
        Grid.add(roomHeader, 0, row);

        Label slotHeader = new Label("Slots");
        slotHeader.setFont(Font.font("Times new roman", FontWeight.BOLD, 35));
        Grid.add(slotHeader, 1, row);

        // Increase row index
        row++;

        // Add operation rooms and slots to the grid pane
        for (OperationRoom room : operationRooms) {
            // Create VBox for room
            VBox roomVBox = new VBox();
            Grid.add(roomVBox, 0, row ++);
            roomVBox.setAlignment(Pos.CENTER);


            // Add room label
            Label roomLabel = new Label("Room " + room.getRoomNumber());
            roomVBox.getChildren().add(roomLabel);
            roomLabel.setFont(Font.font("Times New Roman", 20));

            // Create VBox for slots
            VBox slotsVBox = new VBox();
            Grid.add(slotsVBox, 1, row);
            slotsVBox.setAlignment(Pos.CENTER);

            // Add slots next to the room label
            ArrayList<String> slots = room.getSlots();

            for (int i = 0; i < slots.size(); i++) {
                Button slotButton = new Button(slots.get(i));
                slotsVBox.getChildren().add(slotButton);
                slotButton.setFont(Font.font("Times New Roman", 20));

                // Add event handler to handle slot button click
                slotButton.setOnAction(event -> handleSlotButtonClick(room, slotButton));
            }

            row++;

        }
    }


    private void handleSlotButtonClick(OperationRoom room, Button slotButton) {
        // Handle the slot button click event
        String selectedSlot = slotButton.getText();
        room.removeSlot(selectedSlot);
        slotButton.setDisable(true);
    }

    @FXML
    void Back(MouseEvent event) {
        try {
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(getClass().getResource("Start_Page.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            System.out.println("y" + ex.getMessage());

        }
    }
}
