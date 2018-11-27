package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("FV/00001");

        Item item1 = new Item(new BigDecimal(13), 3);
        Item item2 = new Item(new BigDecimal(1300), 2);
        Item item3 = new Item(new BigDecimal(120), 8);

        Product product1 = new Product("Yellow duck");
        Product product2 = new Product("Huawei P10 Lite");
        Product product3 = new Product("Mouse Logitech M590");

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);

        product1.getItems().add(item1);
        product2.getItems().add(item2);
        product3.getItems().add(item3);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        //When
        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);
        invoiceDao.save(invoice);
        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);

        int id = invoice.getId();
        BigDecimal value = new BigDecimal(2600);

        //Then
        Assert.assertNotEquals(0, id);
        Assert.assertEquals("Mouse Logitech M590", invoice.getItems().get(2).getProduct().getName());
        Assert.assertEquals(value, invoice.getItems().get(1).getValue());
    }
}
