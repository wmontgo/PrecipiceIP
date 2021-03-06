package com.pit.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "login_credential")
@NamedQueries({
	@NamedQuery(name = "QUERY_LOGIN_AUTH", query = "from LoginRegistartionModel loginReg where loginReg.userId=:userId and loginReg.password=:password"),
	@NamedQuery(name = "QUERY_LOGIN_FORGOT", query = "from LoginRegistartionModel loginReg where loginReg.emailID=:emailID")
})

public class LoginRegistartionModel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CREDENTIAL_ID")
	private int credentialId;

	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "EMAIL_ID")
	private String emailID;
	
	@Column(name = "USER_ID")
	private String userId ;
	
	@Column(name = "PASSWORD")
	private String password;
	

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(final String emailID) {
		this.emailID = emailID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}
	
	public int getCredentialId() {
		return credentialId;
	}

	public void setCredentialId(int credentialId) {
		this.credentialId = credentialId;
	}
	
}
