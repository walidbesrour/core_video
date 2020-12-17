package com.mycompany.invoce.core.controller;

import com.mycompany.invoce.core.entity.Invoice;
import com.mycompany.invoce.core.service.InvoiceServiceInterface;

public interface InvoiceControllerInterface {
    String createInvoice(Invoice invoice);
    void setInvoiceService(InvoiceServiceInterface invoiceService);
}
