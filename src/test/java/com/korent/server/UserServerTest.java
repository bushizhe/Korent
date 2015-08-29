package com.korent.server;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import javax.transaction.Transactional;

import static org.junit.Assert.*;

@ContextConfiguration(locations = "classpath:spring-hibernate.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
@Transactional
public class UserServerTest {
    @Autowired
    UserServer userServer;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetAllFollowRentGoods() throws Exception {

    }

    @Test
    public void testGetFollowRentGoodsByPage() throws Exception {

    }

    @Test
    public void testGetAllRoderGoods() throws Exception {

    }

    @Test
    public void testGetOrderGoodsByPage() throws Exception {

    }

    @Test
    public void testGetInformation() throws Exception {
        System.out.println(userServer.information(3));

    }

    @Test
    public void testGetUserDao() throws Exception {

    }

    @Test
    public void testGetAllFollowRentGoods1() throws Exception {

    }

    @Test
    public void testGetFollowRentGoodsByPage1() throws Exception {

    }

    @Test
    public void testGetFollowGoodsCount() throws Exception {
        Integer result = userServer.getFollowGoodsCount(3,1);
        assertEquals(Integer.valueOf(2), result);
        assertEquals(Integer.valueOf(0), (Integer)userServer.getFollowGoodsCount(100, 1));

    }

    @Test
    public void testGetAllRoderGoods1() throws Exception {

    }

    @Test
    public void testGetOrderGoodsByPage1() throws Exception {

    }

    @Test
    public void testGetOrderGoodsCount() throws Exception {

    }

    @Test
    public void testGetSendGoods() throws Exception {

    }

    @Test
    public void testGetSendGoodsbyPage() throws Exception {

    }

    @Test
    public void testGetSendGoodsCount() throws Exception {

    }
}