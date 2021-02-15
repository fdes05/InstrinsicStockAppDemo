package com.Fabio.IntrinsicStockAppDemo.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "portfolios")
public class Portfolio {

	private Long portfolio_Id;
	private String name;	
	private List<Company> company = new ArrayList<>();	
	private User user;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	public Long getPortfolio_Id() {
		return portfolio_Id;
	}
	public void setPortfolio_Id(Long portfolio_Id) {
		this.portfolio_Id = portfolio_Id;
	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REMOVE})
	@JoinTable(name = "portfolio_company",
	           joinColumns = @JoinColumn(name = "portfolio_id"), 
	           inverseJoinColumns = @JoinColumn(name = "company_id"))
	public List<Company> getCompany() {
		return company;
	}
	public void setCompany(List<Company> company) {
		this.company = company;
	}
	@ManyToOne()
	@JoinColumn(name="user_id")
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
