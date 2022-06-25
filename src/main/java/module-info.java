module com.example.gitkurs {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gitkurs to javafx.fxml;
    exports com.example.gitkurs;
}