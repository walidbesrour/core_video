package com.mycompany.invoce.controller.web;

import com.mycompany.invoce.controller.InvoiceControllerInterface;
import com.mycompany.invoce.entity.Invoice;
import com.mycompany.invoce.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class InvoiceControllerWeb implements InvoiceControllerInterface {

    @Autowired
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
