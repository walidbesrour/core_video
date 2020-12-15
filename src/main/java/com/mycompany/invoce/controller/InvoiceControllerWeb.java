package com.mycompany.invoce.controller;

import com.mycompany.invoce.entity.Invoice;
import com.mycompany.invoce.service.InvoiceServiceInterface;


public class InvoiceControllerWeb implements InvoiceControllerInterface {

    private InvoiceServiceInterface invoiceService ;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    public void createInvoic(){

        String name = "walid bean";
        Invoice invoice = new Invoice();
        invoice.setCustomerName(name);

        invoiceService.createInvoice(invoice);
    }
}
