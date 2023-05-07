/**
 * Upadhyaya, A. (2023). CIS505-T301 Intermediate Java Programming. Bellevue University, all rights reserved. 
 */

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class UpadhyayaEnhancedFutureValueApp extends Application {
    // Create variables for all the UI components
    private Label lblMonthlyPayment = new Label("Monthly Payment:");
    private Label lblInterestRate = new Label("Interest Rate:");
    private Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
    private Label lblYears = new Label("Years:");
    private Label lblFutureValueDate = new Label();

    private TextField txtMonthlyPayment = new TextField();
    private TextField txtInterestRate = new TextField();

    private Button btnClear = new Button("Clear");
    private Button btnCalculate = new Button("Calculate");

    private ComboBox<Integer> cmbYears = new ComboBox<>();

    private TextArea txtResults = new TextArea();

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane container = new GridPane(); // The main container for all the components
        container.setAlignment(Pos.CENTER); // Set container alignment to Center
        container.setPadding(new Insets(11.5, 12.5, 13.5, 14.5)); // Set padding for the container
        container.setHgap(5.5); // Set horizontal gap
        container.setVgap(5.5); // Set verticle gap

        container.add(lblMonthlyPayment, 0, 0); // Add monthly payment label
        container.add(txtMonthlyPayment, 1, 0); // Add monthly payment text field

        container.add(lblInterestRate, 0, 1); // Add interest rate label
        container.add(txtInterestRate, 1, 1); // Add interest rate text

        lblInterestRateFormat.setTextFill(Color.RED); // Set the font color of interest rate instructtions to red
        container.add(lblInterestRateFormat, 1, 2); // Add interest rate instructions label
        GridPane.setHalignment(lblInterestRateFormat, HPos.RIGHT); // Position the label to the right of the pane

        container.add(lblYears, 0, 3); // Add years label
        cmbYears.setMaxWidth(Double.MAX_VALUE); // Set combobox widhth to fill available space in the grid
        for(int i = 0; i <=100; i++) { // Loop to fill integers from 0 to 100 in the years combobox
            cmbYears.getItems().add(i);
        }
        cmbYears.setValue(0); // Set default selection to 0
        container.add(cmbYears, 1, 3); // Add years dropdown

        HBox actionBtnContainer = new HBox(); // Create a new HBox container for action buttons
        actionBtnContainer.setPadding(new Insets(15, 0, 15, 30)); // Set the HBox padding
        actionBtnContainer.setSpacing(10); // Set the HBox spacing
        actionBtnContainer.getChildren().add(0, btnClear); // Add clear button
        actionBtnContainer.getChildren().add(1, btnCalculate); // Add calculate butotn
        container.add(actionBtnContainer, 1, 4); // Add action button container to main grid pane

        btnClear.setOnAction(e -> this.clearFormFields()); // Clear all fields on click of clear button
        btnCalculate.setOnAction(e -> this.calculateResults()); // Calculate and display returns on click of calculate button

        container.add(lblFutureValueDate, 0, 5, 2, 1); // Add text area to main container
        container.add(txtResults, 0, 6, 2, 1); // Add text area to main container

        primaryStage.setTitle("Upadhyaya Future Value App"); // Set the title of the application
        primaryStage.setScene(new Scene(container, 300, 400)); // Create and set scene to stage
        primaryStage.show(); // Show the application
    }

    /**
     * This method clears all the form fields
     */
    private void clearFormFields() {
        txtMonthlyPayment.clear();
        txtInterestRate.clear();
        txtResults.clear();
        cmbYears.setValue(0);
        lblFutureValueDate.setText("");
    }

    /**
     * This method reads values form form fields, calculate future value and displays result in the designated text area
     */
    private void calculateResults() {
        try {
            double futureValue = FinanceCalculator.calculateFutureValue(Double.parseDouble(txtMonthlyPayment.getText()),
                                                                        Double.parseDouble(txtInterestRate.getText()), 
                                                                        cmbYears.getValue());

            lblFutureValueDate.setText("Calculation as of " + this.getTodaysDate());
            txtResults.setText("The future value is " + NumberFormat.getCurrencyInstance().format(futureValue));
        } catch(Exception e) {
            System.out.println("Caught an exception while calculating future value" + e.getLocalizedMessage());
        }
    }

    /**
     * This method returns today's date in MM/dd/yyyy format
     * @return String
     */
    private String getTodaysDate() {
        return new SimpleDateFormat("MM/dd/yyyy").format(new Date());
    }
    
    public static void main(String[] args) {
        launch(args); // Launch Future Value JavaFX application
    }
}
