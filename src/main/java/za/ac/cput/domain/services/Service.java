package za.ac.cput.domain.services;

public abstract class  Service {

    protected int serviceId;
    protected String nameOfService;
    protected String descriptionOfService;
    protected double price;
    protected double duration;




    public String getDescriptionOfService() {
        return descriptionOfService;
    }

    public double getDuration() {
        return duration;
    }

    public String getNameOfService() {
        return nameOfService;
    }

    public double getPrice() {
        return price;
    }

    public int getServiceId() {
        return serviceId;
    }

    @Override
    public String toString()  {
        return "Service{" +
                "descriptionOfService='" + descriptionOfService + '\'' +
                ", service_id=" + serviceId +
                ", nameOfService='" + nameOfService + '\'' +
                ", price=" + price +
                ", duration=" + duration +
                '}';
    }
}
