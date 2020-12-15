package com.mycompany.invoce.service;

import com.mycompany.invoce.entity.Invoice;
import com.mycompany.invoce.repository.InvoiceRepositoryInterface;

public class InvoiceServicePrefix implements InvoiceServiceInterface{

    private static long loastNumber = 112L;

    private InvoiceRepositoryInterface invoiceRepository;

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public void createInvoice(Invoice invoice){
        invoice.setNumber(String.valueOf("INV_"+(++loastNumber)));
        invoiceRepository.creat(invoice);

    }
}
