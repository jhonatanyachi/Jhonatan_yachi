package com.edu.Recorrido.model;

//import java.io.Serializable;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.validation.constraints.Email;
//import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//@Entity
public class User{

	@NotNull
	@Size(min=2, max=50)
	private String marca;
	@NotNull
	@Size(min=2, max=30,message="Hola")
	private String firstName;
	@NotNull
	@Size(min=2, max=30)
	private String lastName;
	@NotNull
	@Size(min=2, max=50)
	private Double recorrido;
	
	private Double galon;
	/*@NotNull
	@Size(min=2, max=50)
	private String address;
	@NotNull
	@Size(min=2, max=20)
	private String city;
	@NotNull
	@Min(9)
	private Integer phone;
	@NotNull
	@Email
	private String email;*/
	
	
	/*public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}*/

	public Double getRecorrido() {
		return recorrido;
	}
	public void setRecorrido(Double recorrido) {
		this.recorrido = recorrido;
	}
	public Double getGalon() {
		return galon;
	}
	public void setGalon(Double galon) {
		this.galon = galon;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
