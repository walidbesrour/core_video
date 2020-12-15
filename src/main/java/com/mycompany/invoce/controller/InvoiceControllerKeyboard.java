package com.mycompany.invoce.controller;

import com.mycompany.invoce.entity.Invoice;
import com.mycompany.invoce.service.InvoiceServiceInterface;

import java.util.Scanner;

public class InvoiceControllerKeyboard implements InvoiceControllerInterface{

    private InvoiceServiceInterface invoiceService ;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    public void createInvoic(){

        System.out.println( "what is custemer name !" );
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Invoice invoice = new Invoice();
        invoice.setCustomerName(name);
        invoiceService.createInvoice(invoice);
    }


}
