package model;

import java.time.LocalDate;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Member { // DB의 레코드와 매핑되는 객체
	private StringProperty uid; // DB의 필드와 매핑
	private StringProperty upw;
	private StringProperty uname;
	private StringProperty contact;
	/*
    private final IntegerProperty zipcode;
    private ObjectProperty<LocalDate> birthday;
	*/
	public Member() {
		this(null, null, null, null);
	}
	
	public Member(String id, String pw, String name, String contact) {
		this.uid = new SimpleStringProperty(id);
		this.uname = new SimpleStringProperty(name);
		this.upw = new SimpleStringProperty(pw);
		this.contact = new SimpleStringProperty(contact);
	}
	
	public String getUid() {
		return this.uid.get();
	}
	public void setUid(String uid) {
		this.uid.set(uid);
	}
    public StringProperty uidProperty() {
        return uid;
    }
    
    public String getUpw() {
    	return this.upw.get();
    }
    public void setUpw(String upw) {
    	this.upw.set(upw);
    }
    public StringProperty upwProperty() {
        return upw;
    }
    
    public String getUname() {
    	return this.uname.get();
    }
    public void setUname(String uname) {
    	this.uname.set(uname);
    }
    public StringProperty unameProperty() {
        return uname;
    }

	public String getContact() {
		return this.contact.get();
	}
	public void setContact(String contact) {
		this.contact.set(contact);
	}
	public StringProperty contactProperty() {
        return contact;
    }

}
