package com.mycompany.invoce.core.repository.database;

import com.mycompany.invoce.core.repository.InvoiceRepositoryInterface;
import com.mycompany.invoce.core.entity.Invoice;
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

    @Override
    public List<Invoice> list() {
        Invoice invoices1 = new Invoice("invoice1","tn");
        Invoice invoices2 =  new Invoice("invoice2","mn");
        Invoice invoices3 = new Invoice("1","tcn");
        Invoice invoices4 =  new Invoice("invoice2","mn","125");

        return List.of(invoices1,invoices2,invoices3,invoices4);
    }

    @Override
    public Invoice getById(String number) {
        Invoice invoices1 = new Invoice(number,"tn");
        return invoices1;
    }
}
