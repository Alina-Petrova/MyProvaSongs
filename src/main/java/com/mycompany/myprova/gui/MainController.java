/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myprova.gui;

import com.mycompany.myprova.App;
import java.awt.MenuItem;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import com.mycompany.myprova.business.DbManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * FXML Controller class
 *
 * @author utente
 */
public class MainController implements Initializable {
    
    @FXML
     BorderPane borderPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            DbManager.check();
        } catch (SQLException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    @FXML 
    public void onClose() {
        System.exit(0);
    }
    
    @FXML 
    public void onViewSongs() throws IOException {
        Parent view = App.loadFXML("viewSongs");
        borderPane.setCenter(view);
    }
    
    @FXML 
    public void onNewSong() throws IOException {
        Parent view = App.loadFXML("newSong");
        borderPane.setCenter(view);
    }
    
    @FXML 
    public void onConfigura() throws IOException {
        Parent view = App.loadFXML("onConfigura");
        borderPane.setCenter(view);       
    }
    
    @FXML 
    public void onAbout() throws IOException {
        Parent view = App.loadFXML("onAbout");
        borderPane.setCenter(view);
    }
    
}
