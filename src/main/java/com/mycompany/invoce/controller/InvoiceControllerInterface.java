package com.mycompany.invoce.controller;

import com.mycompany.invoce.service.InvoiceServiceInterface;

public interface InvoiceControllerInterface {
    void createInvoic();
    void setInvoiceService(InvoiceServiceInterface invoiceService);
}
