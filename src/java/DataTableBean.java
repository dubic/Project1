
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import javax.enterprise.context.SessionScoped;



@SessionScoped
@ManagedBean
@RequestScoped

public class DataTableBean implements Serializable {

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

    public DataTableBean() {
        //addCar();
    }

    private static final List<Car> carList = new ArrayList<Car>();

    public List<Car> getCarList() {
        return carList;
    }

    public String addCar() {
        Car newCar = new Car(this.model, this.manufacturer, this.year, this.color);
        carList.add(newCar);
        return null;
    }

}
