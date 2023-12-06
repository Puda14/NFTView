package org.nftview.launch;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LaunchController {
    private Scene scene;
    private Stage stage;
    private Parent root;

    @FXML
    public void switchScene(ActionEvent event) throws IOException{
        try{
        root = FXMLLoader.load(getClass().getResource("/org/nftview/list/list.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}