/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller.bean;

import com.model.pojo.User;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author Andrew
 */
public class UserBeanTest {
    
    public UserBeanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getUsers method, of class UserBean.
     */
    @Test
    public void testGetUsers() {
        System.out.println("getUsers");
        UserBean instance = new UserBean();
        List<User> expResult = null;
        List<User> result = instance.getUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addUser method, of class UserBean.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        UserBean instance = new UserBean();
        instance.addUser();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeUser method, of class UserBean.
     */
    @Test
    public void testChangeUser() {
        System.out.println("changeUser");
        User user = null;
        UserBean instance = new UserBean();
        instance.changeUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UpdateUser method, of class UserBean.
     */
    @Test
    public void testUpdateUser() {
        System.out.println("UpdateUser");
        User user = null;
        UserBean instance = new UserBean();
        instance.UpdateUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUser method, of class UserBean.
     */
    @Test
    public void testDeleteUser() {
        System.out.println("deleteUser");
        User user = null;
        UserBean instance = new UserBean();
        instance.deleteUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

  
    /**
     * Test of getUser method, of class UserBean.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        UserBean instance = new UserBean();
        User expResult = null;
        User result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser method, of class UserBean.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        User user = null;
        UserBean instance = new UserBean();
        instance.setUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNewuser method, of class UserBean.
     */
    @Test
    public void testGetNewuser() {
        System.out.println("getNewuser");
        UserBean instance = new UserBean();
        User expResult = null;
        User result = instance.getNewuser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNewuser method, of class UserBean.
     */
    @Test
    public void testSetNewuser() {
        System.out.println("setNewuser");
        User newuser = null;
        UserBean instance = new UserBean();
        instance.setNewuser(newuser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsersList method, of class UserBean.
     */
    @Test
    public void testGetUsersList() {
        System.out.println("getUsersList");
        UserBean instance = new UserBean();
        List<User> expResult = null;
        List<User> result = instance.getUsersList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsersList method, of class UserBean.
     */
    @Test
    public void testSetUsersList() {
        System.out.println("setUsersList");
        List<User> usersList = null;
        UserBean instance = new UserBean();
        instance.setUsersList(usersList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSearchList method, of class UserBean.
     */
    @Test
    public void testGetSearchList() {
        System.out.println("getSearchList");
        UserBean instance = new UserBean();
        List<User> expResult = null;
        List<User> result = instance.getSearchList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSearchList method, of class UserBean.
     */
    @Test
    public void testSetSearchList() {
        System.out.println("setSearchList");
        List<User> searchList = null;
        UserBean instance = new UserBean();
        instance.setSearchList(searchList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onRowEdit method, of class UserBean.
     */
    @Test
    public void testOnRowEdit() {
        System.out.println("onRowEdit");
        RowEditEvent event = null;
        UserBean instance = new UserBean();
        instance.onRowEdit(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onCancel method, of class UserBean.
     */
    @Test
    public void testOnCancel() {
        System.out.println("onCancel");
        RowEditEvent event = null;
        UserBean instance = new UserBean();
        instance.onCancel(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
