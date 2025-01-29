module a.javafx_notes {
    requires javafx.controls;
    requires javafx.fxml;


    opens a.javafx_notes to javafx.fxml;
    exports a.javafx_notes;
}