package com.example.ogani.model.request;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrderRequest {
    
    @NotNull(message="Họ khách hàng rỗng")
    @NotEmpty(message="Họ khách hàng rỗng")
    @Size(min=3,max=50,message="Họ khách hàng từ 3-50 ký tự")
    private String firstname;
    
    @NotNull(message="Tên khách hàng rỗng")
    @NotEmpty(message="Tên khách hàng rỗng")
    @Size(min=3,max=50,message="Tên khách hàng từ 3-50 ký tự")
    private String lastname;

    @NotNull(message="Tên quốc gia rỗng")
    @NotEmpty(message="Tên quốc gia rỗng")
    private String country;

    @NotNull(message="Tên địa chỉ rỗng")
    @NotEmpty(message="Tên địa chỉ rỗng")
    private String address;

    @NotNull(message="Tên quốc gia rỗng")
    @NotEmpty(message="Tên quốc gia rỗng")
    private String town;

    @NotNull(message="Tên khu vực rỗng")
    @NotEmpty(message="Tên khu vực rỗng")
    private String state;

    @NotNull(message ="Mã bưu điện rỗng")
    @NotEmpty(message ="Mã bưu điện rỗng")
    private long postCode;

    @NotNull(message = "Email rỗng")
    @NotEmpty(message = "Email rỗng")
    @Email(message = "Email không đúng định dạng")
    private String email;
     
    @NotNull(message="Số điện thoại rỗng")
    @NotEmpty(message="Số điện thoại rỗng")
    private String phone;

    private String note;

    private long totalPrice;
    
    private String username;

    private List<CreateOrderDetailRequest> orderDetails;

	public CreateOrderRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreateOrderRequest(
			@NotNull(message = "Họ khách hàng rỗng") @NotEmpty(message = "Họ khách hàng rỗng") @Size(min = 3, max = 50, message = "Họ khách hàng từ 3-50 ký tự") String firstname,
			@NotNull(message = "Tên khách hàng rỗng") @NotEmpty(message = "Tên khách hàng rỗng") @Size(min = 3, max = 50, message = "Tên khách hàng từ 3-50 ký tự") String lastname,
			@NotNull(message = "Tên quốc gia rỗng") @NotEmpty(message = "Tên quốc gia rỗng") String country,
			@NotNull(message = "Tên địa chỉ rỗng") @NotEmpty(message = "Tên địa chỉ rỗng") String address,
			@NotNull(message = "Tên quốc gia rỗng") @NotEmpty(message = "Tên quốc gia rỗng") String town,
			@NotNull(message = "Tên khu vực rỗng") @NotEmpty(message = "Tên khu vực rỗng") String state,
			@NotNull(message = "Mã bưu điện rỗng") @NotEmpty(message = "Mã bưu điện rỗng") long postCode,
			@NotNull(message = "Email rỗng") @NotEmpty(message = "Email rỗng") @Email(message = "Email không đúng định dạng") String email,
			@NotNull(message = "Số điện thoại rỗng") @NotEmpty(message = "Số điện thoại rỗng") String phone,
			String note, long totalPrice, String username, List<CreateOrderDetailRequest> orderDetails) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.country = country;
		this.address = address;
		this.town = town;
		this.state = state;
		this.postCode = postCode;
		this.email = email;
		this.phone = phone;
		this.note = note;
		this.totalPrice = totalPrice;
		this.username = username;
		this.orderDetails = orderDetails;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getPostCode() {
		return postCode;
	}

	public void setPostCode(long postCode) {
		this.postCode = postCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public long getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(long totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<CreateOrderDetailRequest> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<CreateOrderDetailRequest> orderDetails) {
		this.orderDetails = orderDetails;
	}
    
    
}
