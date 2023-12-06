package org.nftview.list;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.nftview.NFT;
import javafx.scene.control.ListCell;

public class NFTListCell extends ListCell<NFT> {
    @Override
    protected void updateItem(NFT nft, boolean empty) {
        super.updateItem(nft, empty);

        // Check if the cell is empty or the NFT object is null
        if (empty || nft == null) {
            // If true, set the text and graphic of the cell to null
            setText(null);
            setGraphic(null); // Set the graphic to null to remove any previous image (if exists).
        } else {
            // If not empty, set the text to display name and info
            setText("Name: " + nft.getName() + "\nInfo: " + nft.getInfo());

            // Create an ImageView to display the image from the provided link
            ImageView imageView = new ImageView(new Image(nft.getImageLink()));

            // Set the desired width for the image (adjust as needed)
            imageView.setFitWidth(50);

            // Preserve the aspect ratio of the image
            imageView.setPreserveRatio(true);

            // Set the ImageView as the graphic for the cell
            setGraphic(imageView);
        }
    }
}
