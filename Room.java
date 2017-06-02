   public class Room {
      private String RoomNo;
      private boolean available;
      public Room (String no , boolean ava){
         RoomNo=no;
         available=ava;}
   
      public void setNum (String num){
         RoomNo=num;}
   
      public void setNum (boolean v){
         available=v;}
   
      public String getNum (){ 
         return RoomNo;}
			


		public void setAvailable (boolean a){
			available = false ;}
      public boolean getAvailable (){ 
         return available;}
	 
	 
	 System.out.println("Hello world");
   
   }
