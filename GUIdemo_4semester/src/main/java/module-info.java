module com.example.guidemo_4semester {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.guidemo_4semester to javafx.fxml;
    exports com.example.guidemo_4semester;
}