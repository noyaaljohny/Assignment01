import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Arrays;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create sample student
        Student student = new Student("John", "Doe", 123456, Arrays.asList("Soccer", "Swimming"), "https://via.placeholder.com/200");

        // Create controller and show GUI
        StudentCardController controller = new StudentCardController(student);
        controller.show(primaryStage);
    }
}
