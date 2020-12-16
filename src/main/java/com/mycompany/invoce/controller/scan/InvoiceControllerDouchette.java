package com.mycompany.invoce.controller.scan;

import com.mycompany.invoce.controller.InvoiceControllerInterface;
import com.mycompany.invoce.entity.Invoice;
import com.mycompany.invoce.service.InvoiceServiceInterface;
import org.springframework.stereotype.Controller;


//@Controller
public class InvoiceControllerDouchette implements InvoiceControllerInterface {

    private InvoiceServiceInterface invoiceService ;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    @Override
    public void createInvoic() {
        System.out.println("usage of a scanner ");
        Invoice invoice = new Invoice();
        invoice.setCustomerName("titos international M2");
        invoiceService.createInvoice(invoice);

    }
}
