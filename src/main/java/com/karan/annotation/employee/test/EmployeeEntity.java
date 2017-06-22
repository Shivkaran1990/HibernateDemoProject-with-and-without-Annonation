package com.karan.annotation.employee.test;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity(name = "JoinTableEmployeeEntity")
@Table(name = "EMP", uniqueConstraints = {
		@UniqueConstraint(columnNames = "ID"),
		@UniqueConstraint(columnNames = "EMAIL") })
public class EmployeeEntity implements Serializable {

	//private static final long serialVersionUID = -1798070786993154676L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false, unique = true)
	private Integer employeeId;

	@Column(name = "EMAIL", nullable = false, unique = true)
	private String email;

	@Column(name = "FIRST_NAME", nullable = false, unique = false)
	private String firstName;

	@Column(name = "LAST_NAME", nullable = false, unique = false)
	private String lastName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "EMP_ACCOUNT",joinColumns={@JoinColumn(name="EMP_ID",referencedColumnName="ID")},
	inverseJoinColumns={@JoinColumn(name="ACCOUNT_ID",referencedColumnName="ID")})
	private Set<AccountEntity> accounts;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public String getEmail() {
		return email;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Set<AccountEntity> getAccounts() {
		return accounts;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAccounts(Set<AccountEntity> accounts) {
		this.accounts = accounts;
	}

}
