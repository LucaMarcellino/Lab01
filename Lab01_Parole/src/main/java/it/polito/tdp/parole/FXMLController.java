package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;
    @FXML
    private Button Cancella;

    @FXML
    void doCancella(ActionEvent event) {
    	String selezionato=txtResult.getSelectedText();
    	elenco.cancellaParola(selezionato);
    	txtResult.clear();
    	String result="";
    	for(String s: elenco.getElenco()) {
    		result+=s+"\n";
    	}
    	txtResult.setText(result);
    }
    @FXML
    void doInsert(ActionEvent event) {
    	String st="";
    	st=txtParola.getText();
    	this.elenco.addParola(st);
    	String result="";
    	for(String s: elenco.getElenco()) {
    		result+=s+"\n";
    	}
    	txtResult.setText(result);
    	
    	txtParola.clear();
    }

    @FXML
    void doReset(ActionEvent event) {
    	elenco.reset();
    	txtResult.clear();
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole() ;
    }
}
