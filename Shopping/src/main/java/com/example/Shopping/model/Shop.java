package com.example.Shopping.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "shop")
public class Shop {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int shopId;

	@Column(name = "shop_category")
	private String shopCategory;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "employee_ids", referencedColumnName = "id")
	private Set<Employee> shopEmployeeID = new HashSet<Employee>();

	@Column(name = "shop_name")
	private String shopName;

	@Column(name = "shop_status")
	private String shopStatus;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "shop_owner_id", referencedColumnName = "id")
	private ShopOwner shopOwner;

	@Column(name = "lease_status")
	private String leaseStatus;

	public Shop() {
	}

	public Shop(int shopId, String shopCategory, Set<Employee> shopEmployeeID, String shopName, String shopStatus,
			ShopOwner shopOwner, String leaseStatus) {
		super();
		this.shopId = shopId;
		this.shopCategory = shopCategory;
		this.shopEmployeeID = shopEmployeeID;
		this.shopName = shopName;
		this.shopStatus = shopStatus;
		this.shopOwner = shopOwner;
		this.leaseStatus = leaseStatus;
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getShopCategory() {
		return shopCategory;
	}

	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopStatus() {
		return shopStatus;
	}

	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}

	public ShopOwner getShopOwner() {
		return shopOwner;
	}

	public void setShopOwner(ShopOwner shopOwner) {
		this.shopOwner = shopOwner;
	}

	public String getLeaseStatus() {
		return leaseStatus;
	}

	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}

	public Set<Employee> getShopEmployeeID() {
		return shopEmployeeID;
	}

	public void setShopEmployeeID(Set<Employee> shopEmployeeID) {
		this.shopEmployeeID = shopEmployeeID;
	}

	public void add(Employee employee) {

		if (employee != null) {
			if (shopEmployeeID == null) {
				shopEmployeeID = new HashSet<>();
			}

			shopEmployeeID.add(employee);
		}
	}

	@Override
	public String toString() {
		return "Shop [shopId=" + shopId + ", shopCategory=" + shopCategory + ", shopEmployeeID=" + shopEmployeeID
				+ ", shopName=" + shopName + ", shopStatus=" + shopStatus + ", shopOwner=" + shopOwner
				+ ", leaseStatus=" + leaseStatus + "]";
	}

}
