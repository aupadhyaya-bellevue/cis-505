/**
 * Upadhyaya, A. (2023). CIS505-T301 Intermediate Java Programming. Bellevue University, all rights reserved. 
 */

import java.util.ArrayList;

import javafx.application.Application;
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
import javafx.stage.Stage;

public class UpadhyayaGradeBookApp extends Application {
    // Create all the UI components
    private Label lblFirstName = new Label("First Name:");
    private Label lblLastName = new Label("Last Name:");
    private Label lblCourse = new Label("Course:");
    private Label lblGrade = new Label("Grade");

    private TextField txtFirstName = new TextField();
    private TextField txtLastName = new TextField();
    private TextField txtCourse = new TextField();
    private ComboBox<String> cmbGrade = new ComboBox<>();

    private Button btnClear = new Button("Clear Form");
    private Button btnViewGrades = new Button("View Saved Grades");
    private Button btnSave = new Button("Save");

    private Label lblResults = new Label("Students Grades");
    private TextArea txtResults = new TextArea();

    public void start(Stage primaryStage) throws Exception {
        GridPane container = new GridPane(); // The main container for all the components
        container.setAlignment(Pos.CENTER); // Set container alignment to Center
        container.setPadding(new Insets(11.5, 12.5, 13.5, 14.5)); // Set padding for the container
        container.setHgap(5.5); // Set horizontal gap
        container.setVgap(5.5); // Set verticle gap

        container.add(lblFirstName, 0, 0); // Add first name label
        container.add(txtFirstName, 1, 0); // Add first name text field

        container.add(lblLastName, 0, 1); // Add last name label
        container.add(txtLastName, 1, 1); // Add last name text field

        container.add(lblCourse, 0, 2); // Add course label
        container.add(txtCourse, 1, 2); // Add course text field

        cmbGrade.getItems().addAll("A", "B", "C", "D", "E", "F"); // Fill grade values in the combobox
        cmbGrade.setMaxWidth(Double.MAX_VALUE); // Set combobox widhth to fill available space in the grid
        container.add(lblGrade, 0, 3); // Add grade combobox label
        container.add(cmbGrade, 1, 3); // Add grade combobox

        HBox actionBtnContainer = new HBox(); // Create a new HBox container for action buttons
        actionBtnContainer.setPadding(new Insets(15, 0, 15, 30)); // Set the HBox padding
        actionBtnContainer.setSpacing(10); // Set the HBox spacing
        actionBtnContainer.getChildren().add(0, btnClear); // Add clear button
        actionBtnContainer.getChildren().add(1, btnViewGrades); // Add view grade butotn
        actionBtnContainer.getChildren().add(2, btnSave); // Add save butotn
        container.add(actionBtnContainer, 1, 4); // Add action button container to main grid pane

        btnClear.setOnAction(e -> clearForm()); // Set action to clear form
        btnSave.setOnAction(e -> { // Set action to save student's grade
            try {
                saveStudentGrade();
            } catch (Exception e1) {
                System.out.println("Unable to save student's grade" + e1.getMessage());
            }
        });
        btnViewGrades.setOnAction(e -> viewGrades());

        container.add(lblResults, 0, 5, 2, 1); // Add results label to main container
        container.add(txtResults, 0, 6, 2, 1); // Add results text area to main container

        primaryStage.setTitle("Upadhyaya Grade Book App"); // Set the title of the application
        primaryStage.setScene(new Scene(container, 400, 450)); // Create and set scene to stage
        primaryStage.setResizable(false);
        primaryStage.show(); // Show the application
    }

    /**
     * This method is invoked on click of Clear button to reset the form
     */
    private final void clearForm() {
        txtFirstName.clear();
        txtLastName.clear();
        txtCourse.clear();
        cmbGrade.setValue("");
        txtResults.clear();
    }

    private final void saveStudentGrade() throws Exception {
        // Create object of StudentGradeIO
        StudentGradeIO studentGradeIO = new StudentGradeIO();

        // Create an instance of Student using values entered by the user
        Student student = new Student(txtFirstName.getText(), txtLastName.getText(), txtCourse.getText(), cmbGrade.getValue());

        studentGradeIO.saveStudentGrades(student);

        // Clear the form after successful entry
        clearForm();
    }

    private void viewGrades() {
        try {
            // Create object of StudentGradeIO
            StudentGradeIO studentGradeIO = new StudentGradeIO();

            ArrayList<Student> students = studentGradeIO.getAllStudentGrades();

            // Prepare results
            StringBuilder results = new StringBuilder();
            for(Student student: students) {
                results.append(student.toString() + "\n");
                results.append("-------------------------------------\n");
            }

            // Print results in the text area
            txtResults.setText(results.toString());
        } catch(Exception ex) {
            txtResults.setText("No saved grades found!");
        }
    }

    public static void main(String[] args) {
        launch(args); // Launch Grade Book JavaFX application
    }
}
