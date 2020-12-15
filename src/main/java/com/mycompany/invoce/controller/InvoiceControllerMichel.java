package com.mycompany.invoce.controller;

import com.mycompany.invoce.entity.Invoice;
import com.mycompany.invoce.service.InvoiceServiceInterface;
import com.mycompany.invoce.service.InvoiceServiceMichel;



public class InvoiceControllerMichel implements InvoiceControllerInterface {

    private InvoiceServiceInterface invoiceService ;
    public void createInvoic(){


        String name = "walid";
        Invoice invoice = new Invoice();
        invoice.setCustomerName(name);

        invoiceService.createInvoice(invoice);
    }
}
