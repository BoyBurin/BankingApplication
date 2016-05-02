/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import View.CreateAccount_View;
import View.Home_View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Kango_000
 */
public class CreateAccount_Controller {
    CreateAccount_View createAccView;
    
    public static void main (String[]ags){
        
    }
    
    public CreateAccount_Controller(){
        createAccView = new CreateAccount_View();
        createAccView.setVisible(true);
        createAccView.setActionHomeButton(new CreateAccount_Controller.HomeAction());
    }
    
    private class createAccAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            String name = createAccView.getMiddleName();
            String middleName = createAccView.getMiddleName();
            String surname = createAccView.getSurname();
            String username = createAccView.getUername();
            String password = createAccView.getPassword();
            String date = createAccView.getDate();
            String email = createAccView.getEmail();
            String phone = createAccView.getPhone();
            String houseNo = createAccView.getHouseNo();
            String soi = createAccView.getSoi();
            String road = createAccView.getRoad();
            String subDistrict = createAccView.getSubDistrict();
            String district = createAccView.getDistrict();
            String province = createAccView.getProvince();
        }
    }
    private class HomeAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            
                Home_Controller home = new Home_Controller();
                createAccView.dispose();
        }
    }
    
}
