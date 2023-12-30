module com.thomasii.budgetplanner.budgetplanner {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.thomasii.budgetplanner.budgetplanner to javafx.fxml;
    exports com.thomasii.budgetplanner.budgetplanner;
}