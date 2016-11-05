package mongodb;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Random;

public class Database {
	public static void main(String[] args) {
		try{
		    PrintWriter writer = new PrintWriter("output1.txt", "UTF-8");
		  //  writer.println("The first line");
		//    writer.println("The second line");
		   
		
   	 String name;
   	 // BEFORE 1980
   	 for(int i = 1;i<=100;i++){
   		    name = "\"Tom\"";
   		    
   		 Random random = new Random();
   		int minDay = (int) LocalDate.of(1940, 1, 1).toEpochDay();
   		int maxDay = (int) LocalDate.of(1980, 1, 1).toEpochDay();
   		long randomDay = minDay + random.nextInt(maxDay - minDay);

   		LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);

   	
   		//System.out.printf("db.clients.insert({name:%s,birthdate:"+"\"%s"+"\"});%n",name  , randomBirthDate );
   		writer.printf("db.clients.insert({name:%s,birthdate:"+"\"%s"+"\"});%n",name  , randomBirthDate );

    }
   	 
   	for(int i = 1;i<=3900;i++){
	    String names[] = {"Jay", "Jim", "Yom", "Axel", "Billy", "Charlie", "Jax", "Gina", "Paul", "Ringo", "Ally", "Nicky", "Cam", "Ari", "Trudie", "Cal", "Carl", "Lady", "Lauren", "Ichabod", "Arthur", "Ashley", "Drake", "Kim", "Julio", "Lorraine", "Floyd", "Janet", "Lydia", "Charles", "Pedro", "Bradley"};
	    Random random = new Random();
   		int minDay = (int) LocalDate.of(1940, 1, 1).toEpochDay();
   		int maxDay = (int) LocalDate.of(1980, 1, 1).toEpochDay();
   		long randomDay = minDay + random.nextInt(maxDay - minDay);

   		LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);
       // System.out.printf("db.clients.insert({name:"+"\"%s"+"\",birthdate:"+"\"%s"+"\"});%n",names[new Random().nextInt(names.length)], randomBirthDate );
   		writer.printf("db.clients.insert({name:"+"\"%s"+"\",birthdate:"+"\"%s"+"\"});%n",names[new Random().nextInt(names.length)], randomBirthDate );
	     }
   	
   	//AFTER 1990
   	for(int i = 1;i<=100;i++){
		    name = "Tom";
		    String names[] = {"Jay", "Jim", "Yom", "Axel", "Billy", "Charlie", "Jax", "Gina", "Paul", "Ringo", "Ally", "Nicky", "Cam", "Ari", "Trudie", "Cal", "Carl", "Lady", "Lauren", "Ichabod", "Arthur", "Ashley", "Drake", "Kim", "Julio", "Lorraine", "Floyd", "Janet", "Lydia", "Charles", "Pedro", "Bradley"};
	        
		    Random random = new Random();
	   		int minDay = (int) LocalDate.of(1990, 1, 1).toEpochDay();
	   		int maxDay = (int) LocalDate.of(2017, 1, 1).toEpochDay();
	   		long randomDay = minDay + random.nextInt(maxDay - minDay);

	   		LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);
	        //System.out.printf("db.clients.insert({name:"+"\"%s"+"\",birthdate:"+"\"%s"+"\"});%n", name + " " + names[new Random().nextInt(names.length)], randomBirthDate );
	   		writer.printf("db.clients.insert({name:"+"\"%s"+"\",birthdate:"+"\"%s"+"\"});%n", name + " " + names[new Random().nextInt(names.length)], randomBirthDate );

   	}
   	for(int i = 1;i<=3900;i++){
	    String names[] = {"Jay", "Jim", "Yom", "Axel", "Billy", "Charlie", "Jax", "Gina", "Paul", "Ringo", "Ally", "Nicky", "Cam", "Ari", "Trudie", "Cal", "Carl", "Lady", "Lauren", "Ichabod", "Arthur", "Ashley", "Drake", "Kim", "Julio", "Lorraine", "Floyd", "Janet", "Lydia", "Charles", "Pedro", "Bradley"};
        
        Random random = new Random();
   		int minDay = (int) LocalDate.of(1990, 1, 1).toEpochDay();
   		int maxDay = (int) LocalDate.of(2017, 1, 1).toEpochDay();
   		long randomDay = minDay + random.nextInt(maxDay - minDay);

   		LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);
		
      //  System.out.printf("db.clients.insert({name:"+"\"%s"+"\",birthdate:"+"\"%s"+"\"});%n",names[new Random().nextInt(names.length)], randomBirthDate );
   	      writer.printf("db.clients.insert({name:"+"\"%s"+"\",birthdate:"+"\"%s"+"\"});%n",names[new Random().nextInt(names.length)], randomBirthDate );
	 
	     }
   	
   	// BETWEEN 1980 - 1990
   	for(int i = 1;i<=2000;i++){
	    String names[] = {"Jay", "Jim", "Yom", "Axel", "Billy", "Charlie", "Jax", "Gina", "Paul", "Ringo", "Ally", "Nicky", "Cam", "Ari", "Trudie", "Cal", "Carl", "Lady", "Lauren", "Ichabod", "Arthur", "Ashley", "Drake", "Kim", "Julio", "Lorraine", "Floyd", "Janet", "Lydia", "Charles", "Pedro", "Bradley"};
	    Random random = new Random();
   		int minDay = (int) LocalDate.of(1981, 1, 1).toEpochDay();
   		int maxDay = (int) LocalDate.of(1990, 1, 1).toEpochDay();
   		long randomDay = minDay + random.nextInt(maxDay - minDay);

   		LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);
       // System.out.printf("db.clients.insert({name:"+"\"%s"+"\",birthdate:"+"\"%s"+"\"});%n",names[new Random().nextInt(names.length)], randomBirthDate );
        writer.printf("db.clients.insert({name:"+"\"%s"+"\",birthdate:"+"\"%s"+"\"});%n",names[new Random().nextInt(names.length)], randomBirthDate );
	
	     }
    writer.close();
   	 
		} catch (Exception e) {
    }
   	 
    
	 

}
}

