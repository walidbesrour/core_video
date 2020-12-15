package com.mycompany.invoce;

import com.mycompany.invoce.controller.InvoiceController;
import com.mycompany.invoce.controller.InvoiceControllerMichel;
import com.mycompany.invoce.entity.Invoice;
import com.mycompany.invoce.service.InvoiceService;
import com.mycompany.invoce.service.InvoiceServiceMichel;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println("dans quelle configuration etes vous ");
        Scanner sc = new Scanner(System.in);
        int categorie = sc.nextInt();
        if(categorie == 1){

            InvoiceController invoiceController = new InvoiceController();
            invoiceController.createInvoic();
        }else if (categorie == 2){
            InvoiceControllerMichel invoiceControllerMichel = new InvoiceControllerMichel();
            invoiceControllerMichel.createInvoic();

        }



    }
}
