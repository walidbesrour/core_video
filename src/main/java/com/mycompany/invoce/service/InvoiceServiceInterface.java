package com.mycompany.invoce.service;

import com.mycompany.invoce.entity.Invoice;
import com.mycompany.invoce.repository.InvoiceRepositoryInterface;

public interface InvoiceServiceInterface {

   void createInvoice(Invoice invoice);
   void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository);
}
