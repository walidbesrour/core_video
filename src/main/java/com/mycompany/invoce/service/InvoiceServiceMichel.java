package com.mycompany.invoce.service;

import com.mycompany.invoce.entity.Invoice;
import com.mycompany.invoce.repository.InvoiceRepository;
import com.mycompany.invoce.repository.InvoiceRepositoryInterface;

public class InvoiceServiceMichel implements InvoiceServiceInterface{

    private static long loastNumber = 112L;

    private InvoiceRepositoryInterface invoiceRepository;

    public void createInvoice(Invoice invoice){
        invoice.setNumber(String.valueOf("INV_"+(++loastNumber)));
        invoiceRepository.creat(invoice);

    }
}
