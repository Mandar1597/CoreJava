package com.example.Shopping.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "mall")
public class Mall {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mall_id")
	private long id;
	
	@Column(name = "mall_name")
	private String mallName;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "categories")
	private String categories;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mall_admin_id", referencedColumnName = "id")
	private MallAdmin mallAdmin;

	public Mall() {
	}

	public Mall(long id, String mallName, String location, String categories, MallAdmin mallAdmin) {
		super();
		this.id = id;
		this.mallName = mallName;
		this.location = location;
		this.categories = categories;
		this.mallAdmin = mallAdmin;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMallName() {
		return mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

	public MallAdmin getMallAdmin() {
		return mallAdmin;
	}

	public void setMallAdmin(MallAdmin mallAdmin) {
		this.mallAdmin = mallAdmin;
	}

	@Override
	public String toString() {
		return "Mall [id=" + id + ", mallName=" + mallName + ", location=" + location + ", categories=" + categories
				+ ", mallAdmin=" + mallAdmin + "]";
	}
}
