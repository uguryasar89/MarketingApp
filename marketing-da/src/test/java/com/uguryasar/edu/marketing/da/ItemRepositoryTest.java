package com.uguryasar.edu.marketing.da;

import com.uguryasar.edu.marketing.da.config.DaConfig;
import com.uguryasar.edu.marketing.da.entity.ItemEntity;
import com.uguryasar.edu.marketing.da.repository.ItemRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.util.List;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes = DaConfig.class)
public class ItemRepositoryTest {

    private static final Logger logger = LoggerFactory.getLogger(ItemRepositoryTest.class);

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private DataSource dataSource;

    @Before
    public void insertItem() {
        ItemEntity item = new ItemEntity();
        item.setBrand("Sony")
            .setName("Xperia X2")
            .setPrice(BigDecimal.valueOf(1550L));

        itemRepository.save(item);
    }

    @After
    public void deleteItem() {
        itemRepository.deleteAll();
    }

    @Test
    public void getItemTest() {
        List<ItemEntity> itemList = (List<ItemEntity>) itemRepository.findAll();

        Assert.assertNotNull(itemList);
        Assert.assertEquals(1, itemList.size());

        ItemEntity item = itemList.get(0);
        Assert.assertNotNull(item);
        Assert.assertEquals("Sony", item.getBrand());
        Assert.assertEquals("Xperia X2", item.getName());
        Assert.assertTrue(BigDecimal.valueOf(1550L).compareTo(item.getPrice()) == 0);

    }

}
