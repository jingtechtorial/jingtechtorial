package OOP.Encapsuation;

public class City {
    private String name;

    private int population;
    private String states;
    private int establishmentYear;
    //setter
    public void setName(String name){
        this.name=name;
    }
    public void setPopulation( int population){
        this.population=population;
    }
    public void setStates(String states){
        this.states=states;
    }
    public void setEstablishmentYear(int establishmentYear){
        this.establishmentYear=establishmentYear;
    }
    //getter
    public String getName(){
        return this.name;
    }
    public int getPopulation(){
        return this.population;
    }
    public String getStates(){
        return this.states;
    }

    public int getEstablishmentYear() {
        return establishmentYear;
    }
}

