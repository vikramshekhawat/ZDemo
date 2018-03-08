
package in.zemy.com.model;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.UserDefinedType;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@UserDefinedType(value = "magento_order_address")
public class Address {

	@SerializedName("region")
	@Expose
	@Column(value = "region")
	private String region;
	
	@SerializedName("postcode")
	@Expose
	@Column(value = "postcode")
	private String postcode;
	
	@SerializedName("lastname")
	@Expose
	@Column(value = "lastname")
	private String lastname;
	
	@SerializedName("street")
	@Expose
	@Column(value = "street")
	private String street;
	
	@SerializedName("city")
	@Expose
	@Column(value = "v")
	private String city;

	@SerializedName("email")
	@Expose
	@Column(value = "email")
	private String email;

	@SerializedName("telephone")
	@Expose
	@Column(value = "telephone")
	private String telephone;

	@SerializedName("country_id")
	@Expose
	@Column(value = "country_id")
	private String countryId;

	@SerializedName("firstname")
	@Expose
	@Column(value = "firstname")
	private String firstname;

	@SerializedName("address_type")
	@Expose
	@Column(value = "address_type")
	private String addressType;

	@SerializedName("prefix")
	@Expose
	@Column(value = "prefix")
	private Object prefix;

	@SerializedName("middlename")
	@Expose
	@Column(value = "middlename")
	private Object middlename;

	@SerializedName("suffix")
	@Expose
	@Column(value = "suffix")
	private Object suffix;

	@SerializedName("company")
	@Expose
	@Column(value = "company")
	private String company;

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public Object getPrefix() {
		return prefix;
	}

	public void setPrefix(Object prefix) {
		this.prefix = prefix;
	}

	public Object getMiddlename() {
		return middlename;
	}

	public void setMiddlename(Object middlename) {
		this.middlename = middlename;
	}

	public Object getSuffix() {
		return suffix;
	}

	public void setSuffix(Object suffix) {
		this.suffix = suffix;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
