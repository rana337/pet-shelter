package com.example.donor333;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import model.*;

public class HelloApplicationMAR extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("welcomeScreen.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        File petsFile = new File("pets.txt");
        File roomsFile = new File("rooms.txt");
        Pet.Pets_string.addAll(Files.readFile(petsFile));
        Pet.Pets.addAll(Files.getAllPets(Pet.Pets_string));
        Room.rooms_string.addAll(Files.readFile(roomsFile));
        Room.rooms.addAll(Files.getAllRooms( Room.rooms_string));

        stage.setScene(scene);
        stage.setMaximized(true);
        stage.setResizable(false);
        stage.setOnCloseRequest(windowEvent -> {
            Files.writePetsOnFile(petsFile);
            Files.writeRoomOnFile(roomsFile);
        });
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}