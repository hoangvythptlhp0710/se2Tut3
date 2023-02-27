package lecture.lec05.creational_patterns.builder;


/**
 *
 * @author Ashwani
 */
public abstract class Coke extends ColdDrink {
    
    @Override
    public abstract  String name();

    @Override
    public abstract  String size();
    
    @Override
    public abstract  float price(); 
    
    
}
