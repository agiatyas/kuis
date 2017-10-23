/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cek_sehat;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
/**
 *
 * @author Tyas
 */
public class FXMLDocumentController implements Initializable {
    
   
   @FXML
    private Label label;

    @FXML
    private JFXTextField nama;

    @FXML
    private JFXTextField tinggi;

    @FXML
    private JFXTextField bb;

    @FXML
    private RadioButton rdLaki;

    @FXML
    private RadioButton rdPerempuan;

    @FXML
    private Button proses;

    @FXML
    private Button reset;

    @FXML
    private Label Ideal;

    @FXML
    private TextField bideal;

    @FXML
    private TextField analisa;

    @FXML
    private TextField saran;
    
    @FXML
    private void proses(ActionEvent event) {
        int BeratIdeal = 0;
        String Saran = "";
        String Analisa = "";
        String Nama = nama.getText();
        int Tinggi = Integer.parseInt(tinggi.getText());
        int Berat = Integer.parseInt(bb.getText());
        
        if(rdLaki.isSelected()){
            BeratIdeal = Tinggi - 105;
            if(BeratIdeal == Berat){
                Analisa = "Ideal";
                Saran = "Saran : \n1. Makan makanan bergizi \n2. Minum susu rutin \n3. Minum vitamin 3 kali sehari";
            }else if(BeratIdeal > Berat){
                Analisa = "UnderWeight";
                Saran = "Saran : \n1. Makan makanan bergizi \n2. Minum susu rutin \n3. Minum vitamin 3 kali sehari";
            }else{
                Analisa = "OverWeight";
                Saran = "Saran : \n1. Makan makanan bergizi \n2. Minum susu rutin \n3. Minum vitamin 3 kali sehari";
            }
        }if(rdPerempuan.isSelected()){
            BeratIdeal = Tinggi - 110;
             if(BeratIdeal == Berat){
                Analisa = "Ideal";
                Saran = "Saran : \n1. Makan makanan bergizi \n2. Minum susu rutin \n3. Minum vitamin 3 kali sehari";
            }else if(BeratIdeal > Berat){
                Analisa = "UnderWeight";
                Saran = "Saran : \n1. Makan makanan bergizi \n2. Minum susu rutin \n3. Minum vitamin 3 kali sehari";
            }else{
                Analisa = "OverWeight";
                Saran = "Saran : \n1. Makan makanan bergizi \n2. Minum susu rutin \n3. Minum vitamin 3 kali sehari";
            }
        }
        bideal.setText(""+BeratIdeal);
        analisa.setText("Nama : "+nama+"\nBerat Badan : "+bb+"\nTinggi : "+tinggi+"\nAnalisa : "+analisa);
        saran.setText("Saran : "+saran);
        
    }
    @FXML
    private void reset(ActionEvent event) {
        nama.setText("");
        tinggi.setText("");
        bb.setText("");
        rdLaki.setText("");
        rdPerempuan.setText("");
        saran.setText("");
        analisa.setText("");
        
    }    
    
}
