import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="personBean")
@SessionScoped
public class PersonBean implements Serializable{

	private static final long serialVersionUID = 1L; 
	private String name;
	private String surname;
	private int age;
	@ManagedProperty(value="#{indirizzoBean}")
	private IndirizzoBean indirizzo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public IndirizzoBean getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(IndirizzoBean indirizzo) {
		this.indirizzo = indirizzo;
	}
}
