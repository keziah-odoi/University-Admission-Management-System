/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginpage;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import static java.lang.Math.random;

/**
 *
 * @author kezia
 */
public class LoginPage extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = (Parent)FXMLLoader.load(getClass().getResource("/loginpage/loginpage.fxml"));
//        Parent root = (Parent)FXMLLoader.load(getClass().getResource("/admin/dashboard/adminDashboard.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.initStyle(StageStyle.TRANSPARENT);

        
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
