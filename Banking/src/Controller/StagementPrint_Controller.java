/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.StagementPrint_View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Kango_000
 */
public class StagementPrint_Controller {
    StagementPrint_View stagementPrintView;


    public StagementPrint_Controller(){
        stagementPrintView = new StagementPrint_View();
        stagementPrintView.setVisible(true);
        stagementPrintView.setActionSearchButton(new StagementPrint_Controller.SearchAction());
        stagementPrintView.setActionHomeButton(new StagementPrint_Controller.homeAction());
    }
    
    //Search
    private class SearchAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event) {
            
        }
    }
    //Home
    private class homeAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            Home_Controller home = new Home_Controller();
                stagementPrintView.dispose();
        }
    }
    
    public static void main(String[] args){
        new StagementPrint_Controller();
    }
}