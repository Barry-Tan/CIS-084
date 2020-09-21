
public class Pants extends Clothing {
    
    private String length;
    private String waist;
    private static int pantCount = 0; // static variable is shared by all object
    
    //getters
    public String getLength() {return length;}
    public String getWaist() {return waist;}
    
    //setters
    public String setLength( String length) {
    
        this.length=length;
        return this.length;
    
    }
    
    public String setWaist( String waist){
         
         this.waist=waist;
         return this.waist;
    }
    
    // constructors
    Pants(){
        pantCount++; //keep track of the number of pants
    }
    
    Pants(int itemID,String type, String brand, String length,String waist, String color, double price, int inStock){
        setItemID(itemID);
        setType(type);
        setBrand(brand);
        setLength(length);
        setWaist(waist);
        setColor(color);
        setPrice(price); //locate in the superclass
        setInStock(inStock); //locate in the superclass
        pantCount++;    //keep track of number of pants
    }// end of seven argument constructor
    @Override
    public String toString(){
        return String.format ("%d %6.2f %s, by %s - %s %s", 
                getItemID(), getPrice(), getType(), getBrand(), getLength(),getWaist());
    }

}// end of class pants
