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
        Student student = new Student("Noyal Johny", "David", 200522151, Arrays.asList("Reading", "Swimming"), "https://drive.google.com/file/d/1_eMsWX7QttgTcjyoBn0ENrI1ZooGYWEF/view");

        // Create controller and show GUI
        StudentCardController controller = new StudentCardController(student);
        controller.show(primaryStage);
    }
}
