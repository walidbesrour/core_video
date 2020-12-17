package com.mycompany.invoce.core.service;

import com.mycompany.invoce.core.entity.Invoice;
import com.mycompany.invoce.core.repository.InvoiceRepositoryInterface;

import java.util.List;

public interface InvoiceServiceInterface {

   void createInvoice(Invoice invoice);
   List<Invoice> getInvoiceList();
   Invoice getInvoiceByNumber(String number);
   void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository);
}
