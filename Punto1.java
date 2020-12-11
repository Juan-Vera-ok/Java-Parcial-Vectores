public class Punto1
{
   public static void main(String[]args)
   {
      int i,dim1,dim2;
      
      do
      {
         dim1=Console.readInt("Ingrese dimension del vector A");
         dim2=Console.readInt("Ingrese dimension del vector B");
      
      
         if(dim1==dim2)
            System.out.println("Los vectores tienen la misma dimension");
      }while(dim1==dim2);
      
      
      int A[]=new int[dim1];
      int B[]=new int[dim2];
      
      System.out.println("Vector A");
      for(i=0;i<dim1;i++)
         A[i]=Console.readInt("Ingrese valores");
      
      System.out.println("Vector A");
      for(i=0;i<dim1;i++)
         System.out.print("|"+A[i]);   
         
         System.out.println();
         
         
      System.out.println("Vector B");
      for(i=0;i<dim2;i++)
         B[i]=Console.readInt("Ingrese valores");
         
         
      System.out.println("Vector B");
      for(i=0;i<dim2;i++)
         System.out.print("|"+B[i]);   
         
         System.out.println();   
      
      boolean bandera;
      
      bandera=true;
      
      if(dim1>dim2)
      {
         for(i=0;i<dim2;i++)
         {
            if(A[i]!=B[i])
            bandera=false;
         }
         
       }else
         {
            for(i=0;i<dim1;i++)
            {
               if(A[i]!=B[i])
               bandera=false;
            }
               
      
         }
         
      if(bandera==true&dim1>dim2)   
      System.out.println("El vector B se encuentra dentro del vector A");
      else
         if(bandera==true&dim2>dim1)
         System.out.println("El vector A se encuentra dentro del vector B");
         else
            if(bandera==false)
            System.out.println("Ningun vector contiene al otro"); 
         
   }
      
      
}
  
//Punto 3)Un vector es homogeneo cuando solo contiene 1 solo tipo de variables ya sea int,char, etc
      //El indice de un vector se usa para recorrerlo o mostrarlo en pantalla