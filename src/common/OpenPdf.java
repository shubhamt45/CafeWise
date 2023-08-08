/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import cafe.management.system.ViewEditDeleteProduct;
import dao.ProductDao;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author shubham c thete
 */
public class OpenPdf {
    public static void openById(String id)
    {
       try{
       if((new File("C:\\Users\\shubham c thete\\Desktop\\bill")).exists()){
       Process p = Runtime
               .getRuntime()
               .exec("rundll32 url.dll,FileProtocolHandler C:\\Users\\shubham c thete\\Desktop\\bill"+id+".pdf");
       }
       else{
        JOptionPane.showMessageDialog(null,"File is not Exists");
       }
       }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
