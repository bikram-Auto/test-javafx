module com.yourassistant.yourassistant {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.yourassistant.yourassistant to javafx.fxml;
    exports com.yourassistant.yourassistant;
}