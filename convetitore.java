package scuola;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class convetitore extends Application{
	Label lris = new Label();
	TextField tnumero = new TextField();
	TextField tbase = new TextField();
	public void start(Stage finestra) {
		GridPane griglia = new GridPane();
		
		Label ltext = new Label("N convertire: ");
		Label ltext1 = new Label("Base di convertire: ");
		Label ltext2 = new Label("Numero convertito: ");
		
		Button pconvertire = new Button();
		pconvertire.setText("Convertire");
		pconvertire.setOnAction(e -> esegui());
		
		griglia.add(ltext, 0, 0);
		griglia.add(tnumero, 1, 0);
		griglia.add(ltext1, 0, 1);
		griglia.add(tbase, 1, 1);
		griglia.add(ltext2, 0, 2);
		griglia.add(lris, 1, 2);
		griglia.add(pconvertire, 0, 4);;
		griglia.setAlignment(Pos.CENTER);
		griglia.setHgap(10);
		griglia.setVgap(5);
		
		Scene scena=new Scene(griglia, 300,300);
		finestra.setTitle("Conventitore");
		finestra.setScene(scena);
		finestra.show();
		
	}
	
	private void esegui() {
		int numero = Integer.parseInt(tnumero.getText());
		int base = Integer.parseInt(tbase.getText());
		int resto = 0;
		String s = " ";
		String a = "" ;
		String b = "" ;
		String c = "" ;
		String d = "" ;
		String e = "" ;
		String f = "" ;
		for(int i=0;numero>0;i++) {
			resto=numero;
			numero=numero/base;
			resto=resto-(numero*base);
			if(resto==10) {
				 a = "A";
				 resto = 16;
			}
			if(resto==11) {
				 b = "B";
				 resto = 16;
			}
			if(resto==12) {
				 c = "C";
				 resto = 16;
			}
			if(resto==13) {
				 d = "D";
				 resto = 16;
			}
			if(resto==14) {
				 e = "E";
				 resto = 16;
				
			}
			if(resto==15) {
				 f = "F";
				 resto = 16;
			}
			
			if(resto!=16) {
				s=resto+s;
			}
		}
		lris.setText(s+a+b+c+d+e+f);
		
	}
	
	public static void main(String[]args) {
		launch(args);
	}

}
