package org.example.product;

//@Entity
//@Table(name = "products")
public class Product {

    //    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
    private Long id;

    //    @Column(name = "name")
    private String name;

    //    @Column(name = "description")
    private String description;

    //    @Column(name = "brand")
    private String brand;

    //    @Column(name = "ingredients")
    private String ingredients;

    //    @Column(name = "location")
    private String location;

    //    @Column(name = "nutritional_information")
    private String nutritionalInformation;

    //    @Column(name = "image_url")
    private String imageUrl;

    //    @Column(name = "price")
    private Double price;

    // Constructors
    public Product() {
        // Default constructor required by Hibernate
    }

    public Product(String name, String description, String brand, String ingredients, String location,
                   String nutritionalInformation, String imageUrl, Double price) {
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.ingredients = ingredients;
        this.location = location;
        this.nutritionalInformation = nutritionalInformation;
        this.imageUrl = imageUrl;
        this.price = price;
    }

    // Getters and setters (or use Lombok for automatic generation)

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getBrand() {
        return brand;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getLocation() {
        return location;
    }

    public String getNutritionalInformation() {
        return nutritionalInformation;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Double getPrice() {
        return price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setNutritionalInformation(String nutritionalInformation) {
        this.nutritionalInformation = nutritionalInformation;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // Other methods, if needed
}
