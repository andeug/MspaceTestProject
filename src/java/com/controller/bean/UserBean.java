package com.controller.bean;  
import javax.faces.bean.ManagedBean;  
import javax.faces.view.ViewScoped;  
import java.util.List;  
import com.dao.UserDAO;  
import com.model.pojo.User;  
import java.io.Serializable;  
import org.primefaces.event.RowEditEvent;  
import javax.faces.context.FacesContext;  
import javax.faces.application.FacesMessage;  
import org.primefaces.context.RequestContext;  
 /**
 *
 * @author Andrew
 */
@ManagedBean(name = "userBean")  
@ViewScoped  
public class UserBean implements Serializable  
{  
    private List < User > usersList;  
    private List < User > searchList;  
    private List < User > filteredList;
    
    UserDAO userDao = new UserDAO();  
    User user = new User();  
    User newuser = new User();  
    
    public List < User > getUsers()  
    {  
        usersList = userDao.AllUsers();  
        //int count = usersList.size();  
        return usersList;  
    }  
    //adding user
    public void addUser()  
    {  
       // String Remark = newuser.getCoursename();  
        Integer userId = 0;  
        userId = userDao.getId();  
        newuser.setId(userId);  
        String Id = Integer.toString(newuser.getId());  
        newuser.setRecordNo(Integer.toString(userId));  
        userDao.add(newuser);  
        System.out.println("Student successfully saved.");  
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Save Information", "Student successfully saved.");  
        RequestContext.getCurrentInstance().showMessageInDialog(message);  
        newuser = new User();  
    }  
  
    public void changeUser(User user)  
    {  
        this.user = user;  
    }  
    //updating the users record through editting event and diplay successfull saving
    public void UpdateUser(User user)  
    {  
        String Name = user.getName();  
        FacesMessage message1 = new FacesMessage(FacesMessage.SEVERITY_INFO, "Name", Name);  
        RequestContext.getCurrentInstance().showMessageInDialog(message1);  
        userDao.update(user);  
        System.out.println("Student Info successfully saved.");  
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Save Information", "Student updated successfully .");  
        RequestContext.getCurrentInstance().showMessageInDialog(message);  
       // user = new User();  
    }  
    //deleting record and display record deleted
    public void deleteUser(User user)  
    {  
       String Name = user.getName();   
        userDao.delete(user);  
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Delete", "Record deleted successfully");  
        RequestContext.getCurrentInstance().showMessageInDialog(message);  
        userDao.refresh(user);
    }  

    public User getUser()  
    {  
        return user;  
    }  
    public void setUser(User user)  
    {  
        this.user = user;  
    }  
    public User getNewuser()  
    {  
        return newuser;  
    }  
    public void setNewuser(User newuser)  
    {  
        this.newuser = newuser;  
    }  
    public List < User > getUsersList()  
    {  
        return usersList;  
    }  
    public void setUsersList(List < User > usersList)  
    {  
        this.usersList = usersList;  
    }  
    public List < User > getSearchList()  
    {  
        return searchList;  
    }  
    //search
    public void setSearchList(List < User > searchList)  
    {  
        this.searchList = searchList;  
    }  
  
    //message diplay on record that is editted when you acept the edit event
    public void onRowEdit(RowEditEvent event)  
    {  
        FacesMessage message = new FacesMessage(" Edited Record No", ((User) event.getObject()).getRecordNo());  
        FacesContext.getCurrentInstance().addMessage(null, message);  
        User editeduser = (User) event.getObject();  
        userDao.update(editeduser);  
    }  
    //canceling the edit event and display cancel message
    public void onCancel(RowEditEvent event)  
    {  
        FacesMessage message = new FacesMessage("Edit Cancelled");  
        FacesContext.getCurrentInstance().addMessage(null, message);  
        usersList.remove((User) event.getObject());  
    }  
    public List<User> getFilteredList() {
        return filteredList;
    }

    public void setFilteredList(List<User> filteredList) {
       this.filteredList = filteredList;
    }
 
    
}  