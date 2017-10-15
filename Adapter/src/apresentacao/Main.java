
package apresentacao;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import modelo.AdapterNovo;
import modelo.AdapterPadrao;
import modelo.Novo.Enviador;
import modelo.Novo.EnviadorSMS;
import modelo.Novo.SMSExecption;
import modelo.Padrao.SMS;
import modelo.Padrao.SMSSender;
import modelo.Padrao.Sender;

public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
                SMSSender s = new Sender();
                SMS msg = new SMS();
                msg.setDestino("Igor");
                msg.setOrigem("Fernando");
                msg.setTexto("OI vui eu fiz! Texto Grandão! Vai quebando aos poucos.....");
                String[] mgs = {"TA AI"," juntando"};
                EnviadorSMS joca = new AdapterNovo(s);
                try {
                    joca.enviarSMS("Igor", "fERNANDO", mgs);
                } catch (SMSExecption ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                System.out.println("=========================");
                SMSSender c = new AdapterPadrao(new Enviador());
                c.senderSMS(msg);
                
                
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
