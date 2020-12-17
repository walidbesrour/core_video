package com.mycompany.invoce.core.controller.scan;

import com.mycompany.invoce.core.controller.InvoiceControllerInterface;
import com.mycompany.invoce.core.entity.Invoice;
import com.mycompany.invoce.core.service.InvoiceServiceInterface;


//@Controller
public class InvoiceControllerDouchette implements InvoiceControllerInterface {

    private InvoiceServiceInterface invoiceService ;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }



    public String createInvoice(Invoice invoice) {
        System.out.println("Usage of a scanner");
        invoice=new Invoice();
        invoice.setCustomerName("Virgin Galactic");
        invoiceService.createInvoice(invoice);
        return null;
    }
}