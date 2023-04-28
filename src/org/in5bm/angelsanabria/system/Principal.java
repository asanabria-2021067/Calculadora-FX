
package org.in5bm.angelsanabria.system;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Angel Sanabria
 * @date 19-02-2022
 * @grade 5to Perito en Informatica B
 * @code IN5BM
 * @carnet 2021067
 */
public class Principal extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
            
    @Override
    public void start(Stage stage) throws Exception {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("../view/FXMLCalculadoraView.fxml"));
        Scene scene= new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Calculadora - Angel Sanabria");
        stage.show();
    
}
}
