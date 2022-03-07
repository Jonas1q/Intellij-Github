module com.example.intellijgithub {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.intellijgithub to javafx.fxml;
    exports com.example.intellijgithub;
}