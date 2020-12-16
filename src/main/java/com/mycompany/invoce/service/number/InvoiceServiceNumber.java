package com.mycompany.invoce.service.number;

import com.mycompany.invoce.entity.Invoice;
import com.mycompany.invoce.repository.InvoiceRepositoryInterface;
import com.mycompany.invoce.service.InvoiceServiceInterface;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServiceNumber implements InvoiceServiceInterface {

    private static long loastNumber = 1L;

    private InvoiceRepositoryInterface invoiceRepository;

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public void createInvoice(Invoice invoice){
        invoice.setNumber(String.valueOf(loastNumber++));
        invoiceRepository.creat(invoice);

    }
}
