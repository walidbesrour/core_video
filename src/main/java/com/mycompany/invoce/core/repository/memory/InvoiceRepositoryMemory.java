package com.mycompany.invoce.core.repository.memory;

import com.mycompany.invoce.core.repository.InvoiceRepositoryInterface;
import com.mycompany.invoce.core.entity.Invoice;


import java.util.ArrayList;
import java.util.List;

//@Repository
public class InvoiceRepositoryMemory implements InvoiceRepositoryInterface {

    private static List<Invoice> invoices = new ArrayList<>();

    public static List<Invoice> getInvoices() {
        return invoices;
    }

    public static void setInvoices(List<Invoice> invoices) {
        InvoiceRepositoryMemory.invoices = invoices;
    }

    public void creat(Invoice invoice){
        invoices.add(invoice);
        System.out.println("invoices added with number " +
                invoice.getNumber()+" for "+ invoice.getCustomerName());

    }

    @Override
    public List<Invoice> list() {
       throw new UnsupportedOperationException();
    }

    @Override
    public Invoice getById(String number) {
        throw new UnsupportedOperationException();
    }
}
