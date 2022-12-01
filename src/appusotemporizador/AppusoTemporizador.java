/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package appusotemporizador;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import componentes.Temporizador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author usuario
 */
public class AppusoTemporizador extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Temporizador temporizador = new Temporizador();
        
        temporizador.setEtiqueta("Cronómetro");
        
        // Funciones de comienzo del contador
        temporizador.setTiempo(0, 0, 3);
        temporizador.calculaCycleCount();
        temporizador.startTimeline();
        
        temporizador.setMedida("segundos");
        temporizador.setColoresYBorde("-fx-background-color: #f54248;","-fx-background-color: #e32026;", 7);
        
        temporizador.setOnFinished(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                temporizador.alertaEstandar();
            }
        });
        
        
        StackPane root = new StackPane();
        root.getChildren().add(temporizador);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
