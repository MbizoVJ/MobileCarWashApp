package za.ac.cput.domain;

public abstract class  Service {

    private int service_id;

    private String name_of_service ;

    private String description_of_service;

    private double price;

    private double duration;

    public String getDescription_of_service() {
        return description_of_service;
    }

    public double getDuration() {
        return duration;
    }

    public String getName_of_service() {
        return name_of_service;
    }

    public double getPrice() {
        return price;
    }

    public int getServiceId() {
        return service_id;
    }

    @Override
    public String toString() {
        return "Service{" +
                "description_of_service='" + description_of_service + '\'' +
                ", service_id=" + service_id +
                ", name_of_service='" + name_of_service + '\'' +
                ", price=" + price +
                ", duration=" + duration +
                '}';
    }
}
