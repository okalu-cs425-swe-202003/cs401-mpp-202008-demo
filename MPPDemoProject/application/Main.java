package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			System.out.println("Changes by somebody from #113..");			
			System.out.println("Changes by somebody from #115..");
			System.out.println("Changes by somebody from #113..");
			
			System.out.println("hardcoded config: --module-path \"C:/Java/javafx-sdk-14.0.2.1/lib/\" --add-modules javafx.controls,javafx.fxml");

			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
