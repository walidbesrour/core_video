package com.mycompany.invoce.repository.database;

import com.mycompany.invoce.entity.Invoice;
import com.mycompany.invoce.repository.InvoiceRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface {

    private static List<Invoice> invoices = new ArrayList<>();

    public static List<Invoice> getInvoices() {
        return invoices;
    }

    public static void setInvoices(List<Invoice> invoices) {
        InvoiceRepositoryDatabase.invoices = invoices;
    }

    public void creat(Invoice invoice){
        invoices.add(invoice);
        System.out.println("database invoices added with number " +
                invoice.getNumber()+" for "+ invoice.getCustomerName());

    }
}
