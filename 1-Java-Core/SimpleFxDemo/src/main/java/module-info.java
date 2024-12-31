module org.example.simplefxdemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens org.example.simplefxdemo to javafx.fxml;
    exports org.example.simplefxdemo;
}