module org.nftview {
    requires javafx.controls;
    requires javafx.fxml;

    exports org.nftview;
    opens org.nftview to javafx.fxml;

    exports org.nftview.launch;
    opens org.nftview.launch to javafx.fxml;

    exports org.nftview.list;
    opens org.nftview.list to javafx.fxml;

    exports org.nftview.detail;
    opens org.nftview.detail to javafx.fxml;
}
