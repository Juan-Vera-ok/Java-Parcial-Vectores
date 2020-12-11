public class Punto2
{
   public static void main(String[]args)
   {
      int i,dim;
      dim=Console.readInt("Ingrese dimension del vector");
      int vec[]=new int[dim];
      
      System.out.println("Vector original");
      
      for(i=0;i<dim;i++)
         vec[i]=Console.readInt("Ingrese valores");
         
      for(i=0;i<dim;i++)
         System.out.print("|"+vec[i]);
         
         System.out.println();
         
      for(i=0;i<dim;i++)
         vec[i]=vec[i]+5;
         
      System.out.println("Vector encriptado");   
         
       for(i=0;i<dim;i++)
         System.out.print("|"+vec[i]); 
            
      
      
      
   }
   
}