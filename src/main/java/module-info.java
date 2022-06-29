module com.example.examenfinal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.examenfinal to javafx.fxml;
    exports com.example.examenfinal;
}