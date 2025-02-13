# **FitDex-System**
🚧 **Work in Progress: Things are subject to change!** 🚧

FitDex-System is a backend service that retrieves food data from multiple sources, providing nutritional and ingredient information based on user location. It also warns users if an ingredient is banned in the EU, USA, or Japan.
It Will be part of the mobile app with the same name "FitDex".

## **Tech Stack**
- **Language**: Java (Maven)
- **Web API Framework**: Javalin
- **Database**: PostgreSQL
- **Data Access**: Raw SQL with JDBC.

## **Features**
✔ Retrieves food product data from various sources.  
✔ Identifies product availability based on user location.  
✔ Provides nutritional and ingredient information.  
✔ Detects and warns about banned ingredients in specific regions (EU, USA, Japan).  
✔ Returns data in JSON format.

## **🚧 Work in Progress**
This project is still in development, and things may change as new features are implemented. Planned updates include:
- Adding **JWT authentication** for secure API access.
- Introducing **environment variables** for configuration.
- Optimizing database queries for better performance.
- Implementing **Docker** for easy deployment.
- Refinement of the features listed above.

## **Setup & Installation**

### **Prerequisites**
- Java 17+ installed
- PostgreSQL installed and running
- Maven installed

### **Steps to Run Locally**
1. Clone the repository:
   ```sh  
   git clone https://github.com/JanInquisitor/FitDex_System
   cd FitDex-System  
   ```  
2. Configure your PostgreSQL database:
   ```sql  
   CREATE DATABASE fitdex;  
   ```  
3. Update database credentials in `DatabaseManager.java`:
   ```java  
   String url = "jdbc:postgresql://localhost:5432/fitdex";  
   String user = "your_username";  
   String password = "your_password";  
   ```  
4. Build and run the project:
   ```sh  
   mvn clean install  
   mvn exec:java -Dexec.mainClass="com.fitdex.Main"  
   ```  

## **API Usage**
### **Search for a Food Product**
#### **Request**
```http  
GET /api/foods/search?query=coke&location=mexico  
```  
#### **Response**
```json  
{  
  "product": "Coca-Cola",  
  "location": "Mexico",  
  "ingredients": ["Carbonated Water", "Sugar-Cane", "Caffeine"],  
  "nutritional_info": {  
    "calories": 150,  
    "sugar": "39g"  
  },  
  "warnings": []  
}  
```  
---  
#### **Request**
```http  
GET /api/foods/search?query=coke&location=usa  
```  
#### **Response**
```json  
{  
  "product": "Coca-Cola",  
  "location": "USA",  
  "ingredients": ["Carbonated Water", "High-Fructose Corn Syrup", "Caffeine"],  
  "nutritional_info": {  
    "calories": 150,  
    "sugar": "39g"  
  },  
  "warnings": ["High-Fructose Corn Syrup is banned in some countries."]  
}  
```  

## **Contributing**
Since the project is still evolving, suggestions and contributions are welcome!  
