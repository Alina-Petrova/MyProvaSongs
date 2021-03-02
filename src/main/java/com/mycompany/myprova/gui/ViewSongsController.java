/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myprova.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 *
 * @author utente
 */
public class ViewSongsController implements Initializable{

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    @FXML
    public void onPlay() {
        System.out.println("onPlay");
    }
    
        @FXML
    public void onUpdate() {
        System.out.println("onUpdate");
    }
    
        @FXML
    public void onDelete() {
        System.out.println("onDelete");
    }
}
