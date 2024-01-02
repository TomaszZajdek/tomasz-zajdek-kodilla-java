package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Optional;

@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private ProductDao productDao;
    @Autowired
    private InvoiceDao invoiceDao;
    @Test
    @Transactional
    void testInvoiceDaoSave() {
        //given
        Product plasticStick = new Product("Plastic Stick");
        Product hammer = new Product("hammer");
        Product shovel = new Product("shovel");

        Item item1 = new Item(plasticStick, new BigDecimal(100.00), 99, new BigDecimal(9900.00) );
        Item item2 = new Item(hammer, new BigDecimal(10.00), 99, new BigDecimal(990.00) );
        Item item3 = new Item(shovel, new BigDecimal(10.00), 9, new BigDecimal(90.00) );

        Invoice invoice = new Invoice("2000/21/23/112");

        invoice.getItems().add(item2);
        invoice.getItems().add(item1);
        invoice.getItems().add(item3);
        //when
        productDao.save(plasticStick);
        productDao.save(hammer);
        productDao.save(shovel);
        invoiceDao.save(invoice);

        Invoice retrievedInvoice = invoiceDao.findById(invoice.getId()).orElse(null);

        Optional<Product> retrievedPlasticStick = productDao.findById(plasticStick.getId());
        Optional<Product> retrievedHammer = productDao.findById(hammer.getId());
        Optional<Product> retrivedShovel = productDao.findById(shovel.getId());

        //then
        Assertions.assertTrue(retrievedPlasticStick.isPresent());
        Assertions.assertTrue(retrivedShovel.isPresent());
        Assertions.assertTrue(retrievedHammer.isPresent());
        Assertions.assertEquals(3, retrievedInvoice.getItems().size());

        //cleanUp
        productDao.delete(plasticStick);
        productDao.delete(hammer);
        productDao.delete(shovel);
        invoiceDao.delete(invoice);

    }
}
