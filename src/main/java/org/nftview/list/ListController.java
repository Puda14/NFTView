package org.nftview.list;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import org.nftview.NFT;
import org.nftview.NftCSV;
import org.nftview.detail.DetailController;

import java.io.IOException;

public class ListController {
    @FXML
    private ListView<NFT> nftListView;

    ObservableList<NFT> nftList = FXCollections.observableArrayList(
            new NFT("NFT 1", "Info 1", "https://res.cloudinary.com/dlgyapagf/image/upload/v1688440170/samples/shoe.jpg"),
            new NFT("NFT 2", "Info 2", "https://res.cloudinary.com/dlgyapagf/image/upload/v1688440170/samples/shoe.jpg"),
            new NFT("NFT 3", "Info 1", "https://res.cloudinary.com/dlgyapagf/image/upload/v1688440170/samples/shoe.jpg"),
            new NFT("NFT 4", "Info 2", "https://res.cloudinary.com/dlgyapagf/image/upload/v1688440170/samples/shoe.jpg"),
            new NFT("NFT 5", "Info 1", "https://res.cloudinary.com/dlgyapagf/image/upload/v1688440170/samples/shoe.jpg"),
            new NFT("NFT 6", "Info 2", "https://res.cloudinary.com/dlgyapagf/image/upload/v1688440170/samples/shoe.jpg"),
            new NFT("NFT 7", "Info 1", "https://res.cloudinary.com/dlgyapagf/image/upload/v1688440170/samples/shoe.jpg"),
            new NFT("NFT 8", "Info 2", "https://res.cloudinary.com/dlgyapagf/image/upload/v1688440170/samples/shoe.jpg"),
            new NFT("NFT 1", "Info 1", "https://res.cloudinary.com/dlgyapagf/image/upload/v1688440170/samples/shoe.jpg"),
            new NFT("NFT 2", "Info 2", "https://res.cloudinary.com/dlgyapagf/image/upload/v1688440170/samples/shoe.jpg"),
            new NFT("NFT 3", "Info 1", "https://res.cloudinary.com/dlgyapagf/image/upload/v1688440170/samples/shoe.jpg"),
            new NFT("NFT 4", "Info 2", "https://res.cloudinary.com/dlgyapagf/image/upload/v1688440170/samples/shoe.jpg"),
            new NFT("NFT 5", "Info 1", "https://res.cloudinary.com/dlgyapagf/image/upload/v1688440170/samples/shoe.jpg"),
            new NFT("NFT 6", "Info 2", "https://res.cloudinary.com/dlgyapagf/image/upload/v1688440170/samples/shoe.jpg"),
            new NFT("NFT 7", "Info 1", "https://res.cloudinary.com/dlgyapagf/image/upload/v1688440170/samples/shoe.jpg")
    );

    public void initialize() {
        // Set the items of the ListView to the NFT list
        nftListView.setItems(nftList);

        // Set a custom cell factory to display NFT information in the ListView
        nftListView.setCellFactory(param -> new NFTListCell());

        // Set an event handler for mouse clicks on the ListView
        nftListView.setOnMouseClicked(event -> {
            if (event.getClickCount() == 2) { // Determine the number of mouse clicks to open details
                handleNFTClick(nftListView.getSelectionModel().getSelectedItem());
            }
        });
    }

    // Handle a double click on an NFT item in the ListView
    private void handleNFTClick(NFT selectedNFT) {
        try {
            // Load the detail.fxml file for the detail view
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/nftview/detail/detail.fxml"));

            // Create a new stage for the detail view
            Stage detailStage = new Stage();
            detailStage.setScene(new Scene(loader.load()));

            // Get the controller associated with the detail view
            DetailController detailController = loader.getController();

            // Set the data labels in the detail view
            detailController.titleLabel.setText(selectedNFT.getName());
            detailController.infoLabel.setText(selectedNFT.getInfo());

            // Show the detail view stage
            detailStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
