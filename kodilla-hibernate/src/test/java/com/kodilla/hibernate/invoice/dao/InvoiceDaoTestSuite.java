package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@Transactional
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product tshirt = new Product("t-shirt");
        Product trousers = new Product("trousers");
        Product dress = new Product("dress");
        Product jacket = new Product("jacket");

        Item itemTshirt = new Item(tshirt, new BigDecimal(10), 2);
        Item itemTrousers = new Item(trousers, new BigDecimal(50), 2);
        Item itemDress = new Item(dress, new BigDecimal(80), 3);
        Item itemJacket = new Item(jacket, new BigDecimal(200), 1);

        Invoice invoice = new Invoice("2021/09/20/202020");

        //When
        invoice.getItems().add(itemDress);
        invoice.getItems().add(itemJacket);
        invoice.getItems().add(itemTrousers);
        invoice.getItems().add(itemTshirt);
        itemTshirt.setInvoice(invoice);
        itemDress.setInvoice(invoice);
        itemJacket.setInvoice(invoice);
        itemTrousers.setInvoice(invoice);

        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then

        assertNotEquals(0,id);

        //ClenUp
        //invoiceDao.deleteById(id);
     }
}
