package com.mycompany.invoce.repository;

import com.mycompany.invoce.entity.Invoice;


import java.util.ArrayList;
import java.util.List;

public class InvoiceRepository implements InvoiceRepositoryInterface {

    private static List<Invoice> invoices = new ArrayList<>();

    public void creat(Invoice invoice){
        invoices.add(invoice);
        System.out.println("invoices added with number " +
                invoice.getNumber()+" for "+ invoice.getCustomerName());

    }
}
