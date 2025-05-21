package za.ac.cput.domain.services;

public class InteriorWash extends Service {
    private boolean engineCleaningIncluded;

    private boolean getIsEngineCleaningIncluded() {
        return engineCleaningIncluded;
    }

    InteriorWash(Builder builder){

        this.engineCleaningIncluded = builder.engineCleaningIncluded;
        this.nameOfService = builder.nameOfService;
        this.serviceId = builder.serviceId;
        this.price = builder.price;
        this.duration = builder.duration;
        this.descriptionOfService = builder.descriptionOfService;

    }

    @Override
    public String toString() {
        return "InteriorWash{" +
                "engineCleaningIncluded=" + engineCleaningIncluded +
                ", descriptionOfService='" + descriptionOfService + '\'' +
                ", duration=" + duration +
                ", nameOfService='" + nameOfService + '\'' +
                ", price=" + price +
                ", serviceId=" + serviceId +
                '}';
    }

    public static class Builder {
        private boolean engineCleaningIncluded;
        private int serviceId;
        private String nameOfService;
        private String descriptionOfService;
        private double price;
        private double duration;


        public Builder setDescriptionOfService(String descriptionOfService) {
            this.descriptionOfService = descriptionOfService;
            return this;
        }

        public Builder setDuration(double duration) {
            this.duration = duration;
            return this;
        }

        public Builder setNameOfService(String nameOfService) {
            this.nameOfService = nameOfService;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }


        public Builder setServiceID(int serviceID) {
            this.serviceId = serviceID;
            return this;
        }


        public Builder setEngineCleaningIncluded(boolean engineCleaningIncluded) {
            this.engineCleaningIncluded = engineCleaningIncluded;
            return this;
        }




        Builder copy(InteriorWash interiorWash){
            this.engineCleaningIncluded = interiorWash.engineCleaningIncluded;
            this.serviceId = interiorWash.getServiceId();
            this.descriptionOfService = interiorWash.getDescriptionOfService();
            this.nameOfService = interiorWash.getNameOfService();
            this.price = interiorWash.getPrice();
            this.duration = interiorWash.getDuration();
            return this;
        }

        InteriorWash build(){
            return new InteriorWash(this);
        }
    }
}
