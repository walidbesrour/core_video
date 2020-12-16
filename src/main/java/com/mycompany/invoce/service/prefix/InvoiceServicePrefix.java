package com.mycompany.invoce.service.prefix;

import com.mycompany.invoce.entity.Invoice;
import com.mycompany.invoce.repository.InvoiceRepositoryInterface;
import com.mycompany.invoce.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServicePrefix implements InvoiceServiceInterface {

    @Value("${invoice.loastNumber}")
    private long loastNumber ;
    @Value("${invoice.prefix}")
    private String prefix ;

    @Autowired
    private InvoiceRepositoryInterface invoiceRepository;


    public void createInvoice(Invoice invoice){
        invoice.setNumber(String.valueOf(prefix +(++loastNumber)));
        invoiceRepository.creat(invoice);

    }

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository; }

    public long getLoastNumber() {
        return loastNumber;
    }

    public void setLoastNumber(long loastNumber) {
        this.loastNumber = loastNumber;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}
