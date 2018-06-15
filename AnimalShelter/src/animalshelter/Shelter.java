package animalshelter;
public class Shelter 
{
    private double AmountOfAllPlaces;
    private double AmountOfFreePlaces; 
    
    public double GetAmountOfAllPlaces()
    {
     return AmountOfAllPlaces;
    }
    public void SetAmountOfAllPlaces(double AmountOfAllPlaces )
    {
        this.AmountOfAllPlaces=AmountOfAllPlaces;
    }
    public double GetAmountOfFreePlaces()
    {
        return AmountOfFreePlaces;
    }
    private void SetAmountOfFreePlaces(double AmountOfFreePlaces )
    {
        this.AmountOfFreePlaces=AmountOfFreePlaces;
    }
}
