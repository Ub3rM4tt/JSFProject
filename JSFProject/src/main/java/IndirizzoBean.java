import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="indirizzoBean")
@SessionScoped
public class IndirizzoBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private String città;
	private String via;
	private Integer civico;
	public String getCittà() {
		return città;
	}
	public void setCittà(String città) {
		this.città = città;
	}
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public Integer getCivico() {
		return civico;
	}
	public void setCivico(Integer civico) {
		this.civico = civico;
	}
}
