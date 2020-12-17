package com.mycompany.invoce.core.repository;

import com.mycompany.invoce.core.entity.Invoice;

import java.util.List;

public interface InvoiceRepositoryInterface {
    void creat(Invoice invoice);
    List<Invoice> list();
   Invoice getById(String number);
}
