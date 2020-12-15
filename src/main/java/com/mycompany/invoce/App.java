package com.mycompany.invoce;

import com.mycompany.invoce.controller.InvoiceControllerInterface;
import com.mycompany.invoce.controller.InvoiceControllerKeyboard;
import com.mycompany.invoce.controller.InvoiceControllerDouchette;
import com.mycompany.invoce.controller.InvoiceControllerWeb;
import com.mycompany.invoce.repository.InvoiceRepositoryInterface;
import com.mycompany.invoce.repository.InvoiceRepositoryMemory;
import com.mycompany.invoce.repository.InvoiceRepositoryDatabase;
import com.mycompany.invoce.service.InvoiceServiceInterface;
import com.mycompany.invoce.service.InvoiceServiceNumber;
import com.mycompany.invoce.service.InvoiceServicePrefix;


import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("quelle le nom de classe controleur");
        String controleurtype = sc.nextLine();

        System.out.println("quelle le nom de classe service");
        String servicetype = sc.nextLine();

        System.out.println("quelle le nom de classe repository");
        String repositorytype = sc.nextLine();
        InvoiceControllerInterface invoiceController = null;
        InvoiceServiceInterface invoiceService = null;
        InvoiceRepositoryInterface invoiceRepository = null ;
    try {
        invoiceController = (InvoiceControllerInterface)Class.forName(controleurtype).getDeclaredConstructor().newInstance();
        invoiceService = (InvoiceServiceInterface)Class.forName(servicetype).getDeclaredConstructor().newInstance();
        invoiceRepository = (InvoiceRepositoryInterface)Class.forName(repositorytype).getDeclaredConstructor().newInstance();
    }catch (Exception e){
        e.printStackTrace();
    }


        invoiceController.setInvoiceService(invoiceService);
        invoiceService.setInvoiceRepository(invoiceRepository);
        invoiceController.createInvoic();

//        solution 2
/*
        System.out.println("quelle type de controller ( keyboard , douchette , web ");
        String controleurtype = sc.nextLine();

        System.out.println("quelle type de controller ( number , prefix ");
        String servicetype = sc.nextLine();

        System.out.println("quelle type de controller ( database , memory )");
        String repositorytype = sc.nextLine();

        InvoiceControllerInterface invoiceController = null;
        switch (controleurtype){
            case "keyboard":
                invoiceController = new InvoiceControllerKeyboard();
                break;
            case "douchette":
                invoiceController = new InvoiceControllerDouchette();
                break;
            case "web":
                invoiceController = new InvoiceControllerWeb();
                break;
        }

        InvoiceServiceInterface invoiceService = null;
        switch (servicetype){
            case "number":
                invoiceService = new InvoiceServiceNumber();
                break;
            case "prefix":
                invoiceService = new InvoiceServicePrefix();
                break;
        }

        InvoiceRepositoryInterface invoiceRepository = null ;
        switch (repositorytype){

            case "database":
                invoiceRepository = new InvoiceRepositoryDatabase();
                break;
            case "memory":
                invoiceRepository = new InvoiceRepositoryMemory();
                break;

        }

    invoiceController.setInvoiceService(invoiceService);
        invoiceService.setInvoiceRepository(invoiceRepository);
        invoiceController.createInvoic();

 */
//solution 1
/*
        int categorie = sc.nextInt();
        if(categorie == 1){

            InvoiceControllerKeyboard invoiceController = new InvoiceControllerKeyboard();
            InvoiceServiceNumber invoiceService = new InvoiceServiceNumber();
            InvoiceRepositoryMemory invoiceRepository = new InvoiceRepositoryMemory();
            invoiceController.setInvoiceService(invoiceService);
            invoiceService.setInvoiceRepository(invoiceRepository);
            invoiceController.createInvoic();
        }else if (categorie == 2){
            InvoiceControllerWeb invoiceControllerMichel = new InvoiceControllerWeb();
            InvoiceServicePrefix invoiceServiceMichel = new InvoiceServicePrefix();
            InvoiceRepositoryDatabase invoiceRepositoryMichel = new InvoiceRepositoryDatabase();
            invoiceControllerMichel.setInvoiceService(invoiceServiceMichel);
            invoiceServiceMichel.setInvoiceRepository(invoiceRepositoryMichel);
            invoiceControllerMichel.createInvoic();

        }else if (categorie == 3){
            InvoiceControllerWeb invoiceControllerMichel = new InvoiceControllerWeb();
            InvoiceServiceNumber invoiceService = new InvoiceServiceNumber();
            InvoiceRepositoryDatabase invoiceRepositoryMichel = new InvoiceRepositoryDatabase();
            invoiceControllerMichel.setInvoiceService(invoiceService);
            invoiceService.setInvoiceRepository(invoiceRepositoryMichel);
            invoiceControllerMichel.createInvoic();

        }else if (categorie == 4){
            InvoiceControllerDouchette invoiceControllerMichel = new InvoiceControllerDouchette();
            InvoiceServicePrefix invoiceServiceMichel = new InvoiceServicePrefix();
            InvoiceRepositoryDatabase invoiceRepositoryMichel = new InvoiceRepositoryDatabase();
            invoiceControllerMichel.setInvoiceService(invoiceServiceMichel);
            invoiceServiceMichel.setInvoiceRepository(invoiceRepositoryMichel);
            invoiceControllerMichel.createInvoic();

        }

*/


    }
}
