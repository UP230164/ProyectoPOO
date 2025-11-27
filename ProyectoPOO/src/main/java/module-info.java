module com.posic.proyectopoo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.posic.proyectopoo to javafx.fxml;
    exports com.posic.proyectopoo;
}