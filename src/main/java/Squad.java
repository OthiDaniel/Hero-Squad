import java.util.*;

public class Squad {
   private String squadName;
   private int maxSize;
   private String squadCause;
   private static List<Squad> instances = new ArrayList<Squad>();
   private int mId;
   private List<Hero> heroes;
   private int currentSize;

   public Squad (String squad_name, String squad_size, String squad_cause){
      squadName = squad_name;
      maxSize = Integer.parseInt(squad_size);
      squadCause = squad_cause;
      instances.add(this);
      mId = instances.size();
      heroes = new ArrayList<Hero>();
      currentSize = 0;
   }

   public int getMaxSize(){
      return maxSize;
   }

   public String getSquadName(){
      return squadName;
   }

   public String getSquadCause(){
      return squadCause;
   }

   public static List<Squad> all() {
      return instances;
   }

   public static void clear() {
      instances.clear();
   }

   public int getId() {
      return mId;
   }

   public static Squad find(int id) {
      return instances.get(id - 1);
   }

   public List<Hero> getHeroes() {
      return heroes;
   }

   public int getCurrentSize(){
      return currentSize;
   }

   public void addHero(Hero newHero){
      if (currentSize < maxSize){
         heroes.add(newHero);
         currentSize++;
      }   
   }
}
