package za.ac.cput.domain;

public class InteriorWash extends Service{
    private boolean engine_cleaning_included;

    public boolean getIsEngineCleaningIncluded() {
        return engine_cleaning_included;
    }

    InteriorWash(Builder builder){
        this.engine_cleaning_included = builder.engine_cleaning_included;
    }

    @Override
    public String toString(){
        return "InteriorWash{" +
                "engine_cleaning_included=" + engine_cleaning_included +
                '}';
    }
    public static class Builder extends Service{
        private boolean engine_cleaning_included;

      /*  public Builder setServiceID(int serviceID) {
            this.s = engine_cleaning_included;
            return this;
        }
        */

        public Builder setEngine_cleaning_included(boolean engine_cleaning_included) {
            this.engine_cleaning_included = engine_cleaning_included;
            return this;
        }
        Builder copy(InteriorWash interiorWash){
            this.engine_cleaning_included = interiorWash.engine_cleaning_included;
            return this;
        }

        InteriorWash build(){
            return new InteriorWash(this);
        }
    }
}
