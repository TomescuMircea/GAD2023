public abstract class Publication {
   public abstract String getTitle();
   public abstract String getDescription();

   @Override
   public String toString()
   {
      return getTitle()+" - "+getDescription();
   }

}
