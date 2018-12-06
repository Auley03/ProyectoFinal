package com.proyectofinal.model;

public class Usuario {
	private int idUser;
	private int age;
	private String userName;
	private String userGender;
	private String country;
	private String email;
	
	public Usuario()
	{
		
	}
	
	public Usuario(int idUser, int age, String userName, String userGender)
	{
		setIdUser(idUser);
		setAge(age);
		setUserName(userName);
		setUserGender(userGender);
		setCountry(country);
		setEmail(email);
	}
	
	public int getIdUser()
	{
		return idUser;
	}
	
	public void setIdUser(int idUser)
	{
		this.idUser = idUser;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String getUserName()
	{
		return userName;
	}
	
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	
	public String getUserGender()
	{
		return userGender;
	}
	
	public void setUserGender(String userGender)
	{
		this.userGender = userGender;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString()
	{
		return "Id User: "+getIdUser()+" Age: "+getAge()+" User Name: "+getUserName()+" User Gender: "+getUserGender()+"Country: "+getCountry()+"Email: "+getEmail();
	}
}
