package com.techexercise.ui.beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class PrototypeBean{

    private String testString = "Hello World!";
 
    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }
    
    public void uselessTestUpload() {
    	//testing git commit
    }
}