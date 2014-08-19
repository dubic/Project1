

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import javax.faces.context.FacesContext;

@ViewScoped
@ManagedBean 
@RequestScoped

public class TableBean1 implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String model;
    private String manufacturer;
    private int year;
    private String color;

    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
  private static final List<Car1> carList = new ArrayList<Car1>();
  
  
    public TableBean1() {   
       addAction();  
    }
    
    private String populateIt(List<Car1> list){
      Car1 car1 = new Car1();
      FacesContext.getCurrentInstance().getExternalContext().getFlash().put("index",list);
      return "/index?faces-redirect=true";
    }
    
    public List<Car1> getCarList(){
      return carList;
    }
    
   
    
    public String addAction(){ 
      Car1 car1 = new Car1(this.model,this.manufacturer, this.year, this.color); 
      carList.add(car1);  
      return null;
    }
    
     public String ex(){
      FacesContext.getCurrentInstance().getExternalContext().getFlash().put("index",carList);
      return "/index?faces-redirect=true";
    }  
     
     
     
}
