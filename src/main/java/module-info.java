module rodolfo.module1lab {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens rodolfo.module1lab to javafx.fxml;
    exports rodolfo.module1lab;
}