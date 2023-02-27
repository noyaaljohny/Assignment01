import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class StudentCardView extends VBox {
    private ImageView imageView;
    private Label firstNameLabel;
    private Label lastNameLabel;
    private Label studentNumberLabel;
    private Label favoriteActivitiesLabel;

    public StudentCardView() {
        // Initialize UI components
        imageView = new ImageView();
        imageView.setFitHeight(200);
        imageView.setFitWidth(200);
        firstNameLabel = new Label();
        lastNameLabel = new Label();
        studentNumberLabel = new Label();
        favoriteActivitiesLabel = new Label();
        favoriteActivitiesLabel.setWrapText(true);

        // Add UI components to layout container
        setAlignment(Pos.CENTER);
        setPadding(new Insets(10));
        setSpacing(10);
        getChildren().addAll(imageView, firstNameLabel, lastNameLabel, studentNumberLabel, favoriteActivitiesLabel);

        // Load CSS styles and apply to layout container and UI components
        getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        getStyleClass().add("student-card");
        imageView.getStyleClass().add("student-card-image");
        firstNameLabel.getStyleClass().add("student-card-name");
        lastNameLabel.getStyleClass().add("student-card-name");
        studentNumberLabel.getStyleClass().add("student-card-number");
        favoriteActivitiesLabel.getStyleClass().add("student-card-activities");
    }

    public void update(Student student) {
        // Update UI components with student information
        imageView.setImage(new Image(student.getImageUrl()));
        firstNameLabel.setText(student.getFirstName());
        lastNameLabel.setText(student.getLastName());
        studentNumberLabel.setText("Student Number: " + student.getStudentNumber());
        favoriteActivitiesLabel.setText("Favorite Activities: " + String.join(", ", student.getFavoriteActivities()));
    }
}
