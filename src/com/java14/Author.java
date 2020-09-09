package com.java14;

// Preview
//A record is a data class that stores pure data. The idea behind introducing records is to quickly create simple and concise classes
//devoid of boilerplate code.
//Normally a class in Java would require you to implement equals(), hashCode() , the getters and setters methods. While some IDEs 
//support auto-generation of such classes, the code is still verbose. With a record you need to simply define a class in the 
//following way.

//The Java compiler will generate a constructor, private final fields, accessors, equals/hashCode and toString methods automatically. 
//The auto-generated getter methods of the above class are name() and topic().

//Records Can Implement Interfaces
//The following code shows an example of implementing an interface with records:

//Records support multiple constructors

public record Author(int id, String name, String topic) {

	static int followers;
	 
    public static String followerCount() {
        return "Followers are "+ followers;
    }
 
    public String description(){
        return "Author "+ name + " writes on "+ topic;
    }
 
    public Author{
    if (id < 0) {
        throw new IllegalArgumentException( "id must be greater than 0.");
     }
   }
}
