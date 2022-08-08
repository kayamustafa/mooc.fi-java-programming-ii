
public class Book {
    
    private final String name;
    private final int ageRecommendation;
    
    public Book(String name, int ageRecommendation){
        this.name = name;
        this.ageRecommendation = ageRecommendation;
    }

    public String getName() {
        return name;
    }

    public int getAgeRecommendation() {
        return ageRecommendation;
    }
   
    @Override
    public String toString(){
        return name + " (recommended for " + ageRecommendation + " year-olds or older";
    }
    
}
