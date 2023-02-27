import javafx.scene.Scene;
import javafx.stage.Stage;

public class StudentCardController {
    private Student model;
    private StudentCardView view;
    private Stage stage;

    public StudentCardController(Student model) {
        this.model = model;
        view = new StudentCardView();
        view.update(model);

        // Set up event handling
        view.setOnMouseClicked(event -> {
            System.out.println("Clicked on student card for " + model.getFirstName() + " " + model.getLastName());
        });
    }

    public void show(Stage stage) {
        this.stage = stage;
        stage.setTitle("Student Card");
        Scene scene = new Scene(view);
        stage.setScene(scene);
        stage.show();
    }
}
