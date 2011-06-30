package de.vogella.junit.first;


/**
 * List for string constants that are used for database related classes
 * @author HS
 */
public class Constants {
   public static final String TABLE_NAME = "localhistory";

   //columns in the events database
   public static final String LAT = "lat";
   public static final String LONG = "long";
   public static final String EMO = "emo";
   public static final String MSG = "msg";
   public static final String TIME = "time";
   public static final String UID = "uid";
   public static final String SYNC = "sync";
   
   public Constants(){
	   //constructor
   }
   
   public String getLat(){
	   return LAT;
   }
   
   public String getLong(){
	   return LONG;
   }
   
   public String getEmo(){
	   return EMO;
   }
   
}
