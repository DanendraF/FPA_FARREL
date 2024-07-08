/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgabungan;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class FXMLDocumentController_1 implements Initializable {
    
    @FXML
    private TextField tfHasil;

    @FXML
    private TextField tfJumlah;
    
    @FXML
    private TextField tfIndex;
    
    @FXML
    private TextField tfValue;
    
    
    ArrayList<String> daftarData = new ArrayList<>();
    
    @FXML
    private void tambahData (ActionEvent event) {
        if(tfValue.getText().equals("")){
            System.out.println("Tidak ada data yang ditambahkan");   
        }else{
            if (tfIndex.getText().equals("")){
                daftarData.add(tfValue.getText());
            } else {
                try {
                    daftarData.add(Integer.valueOf(tfIndex.getText()), tfValue.getText());
                } catch (Exception e) {
                    System.out.println("Index tidak ditemukan");
                }
            }
            tfValue.setText("");
            tfIndex.setText("");
            tfHasil.setText(daftarData.toString());
            tfJumlah.setText("Jumlah data: " + daftarData.size());
        }
    }
    
    @FXML
    private void editData (ActionEvent event) {
        if(tfValue.getText().equals("") || tfIndex.getText().equals("")){
            System.out.println("Index dan Value tidak boleh kosong");
        }else{
            try {
                daftarData.set(Integer.valueOf(tfIndex.getText()), tfValue.getText());
                tfIndex.setText("");
                tfValue.setText("");
                tfHasil.setText(daftarData.toString());
                tfJumlah.setText("Jumlah data: " + daftarData.size());
            } catch (Exception e) {
                System.out.println("Index tidak ditemukan");
            }
        }
    }   
    
    
    @FXML
    private void hapusData (ActionEvent event) {
        if(!tfIndex.getText().equals("")){
            try {
                daftarData.remove(Integer.parseInt(tfIndex.getText()));
            } catch (Exception e) {
                System.out.println("Index tidak ditemukan");
            }
        }
        if(!tfValue.getText().equals("")) {
            daftarData.remove(tfValue.getText());
        }
        tfIndex.setText("");
        tfValue.setText("");
        tfHasil.setText(daftarData.toString());
        tfJumlah.setText("Jumlah data: " + daftarData.size());
        
    }
    
    @FXML
    private void clearAllData (ActionEvent event) {
        daftarData.clear();
        tfIndex.setText("");
        tfValue.setText("");
        tfHasil.setText(daftarData.toString());
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tfJumlah.setText("Jumlah data: " + daftarData.size());
    }    
    
}
