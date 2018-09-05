/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.pojo;


import java.util.Date;  
import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;  
import static javax.persistence.GenerationType.IDENTITY;  
import javax.persistence.Id;  
import javax.persistence.Table;  
import javax.persistence.Temporal;  
import javax.persistence.TemporalType;  
/**
 *
 * @author Andrew
 */
@Entity  
@Table(name = "user", catalog = "mspace1")  
public class User implements java.io.Serializable  
{  
    private Integer id;  
    private String recordNo;  
    private String name;  
    private Integer age;  
    private String sex;  
    private Date dob;  
    private String remark;  
    public User()  
    {}  
    public User(String recordNo, String name, Integer age, String sex, Date dob, String remark)  
    {  
        this.recordNo = recordNo;  
        this.name = name;  
        this.age = age;  
        this.sex = sex;  
        this.dob = dob;  
        this.remark = remark;  
    }  
    @Id @GeneratedValue(strategy = IDENTITY)  
    @Column(name = "id", unique = true, nullable = false)  
    public Integer getId()  
    {  
        return this.id;  
    }  
    public void setId(Integer id)  
    {  
        this.id = id;  
    }  
    @Column(name = "RecordNo", length = 20)  
    public String getRecordNo()  
    {  
        return this.recordNo;  
    }  
    public void setRecordNo(String recordNo)  
    {  
        this.recordNo = recordNo;  
    }  
    @Column(name = "Name", length = 50)  
    public String getName()  
    {  
        return this.name;  
    }  
    public void setName(String name)  
    {  
        this.name = name;  
    }  
    @Column(name = "Age")  
    public Integer getAge()  
    {  
        return this.age;  
    }  
    public void setAge(Integer age)  
    {  
        this.age = age;  
    }  
    @Column(name = "Sex", length = 20)  
    public String getSex()  
    {  
        return this.sex;  
    }  
    public void setSex(String sex)  
    {  
        this.sex = sex;  
    }  
    @Temporal(TemporalType.DATE)  
    @Column(name = "Dob", length = 10)  
    public Date getDob()  
    {  
        return this.dob;  
    }  
    public void setDob(Date dob)  
    {  
        this.dob = dob;  
    }  
    @Column(name = "Remark", length = 50)  
    public String getRemark()  
    {  
        return this.remark;  
    }  
    public void setRemark(String remark)  
    {  
        this.remark = remark;  
    }  
    //This method writes the values of contact object with System.out.println(user.toString()) code  
    @Override  
    public String toString()  
    {  
        return "user" +  
            "\n\t RecordNo: " + this.recordNo +  
            "\n\t EmployeeName: " + this.name +  
            "\n\t Age: " + this.age +  
            "\n\t Sex: " + this.sex +  
            "\n\t Date of Birth: " + this.dob +  
            "\n\t Remark: " + this.remark;  
    }  
}  