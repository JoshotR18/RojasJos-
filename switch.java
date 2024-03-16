/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		
  int[] edades={23,56,23,12,23,5};
   int cantMayores=0;
   int cantMenores=0;
   int sumaMayores=0;
    int sumaMenores=0;
    double promedioMayores=0;
    
    for(int i=0; i<edades.length;i++)
{
    switch(edades[i]>17 ?1:0){
      case 1:
          cantMayores++;
        sumaMayores=sumaMayores+edades[i];
    break;
    default:
        cantMenores++;
        sumaMenores=sumaMenores+edades[i];
    }
}  
promedioMayores=sumaMayores/cantMayores;
System.out.println("Promedio de mayores: "+promedioMayores);
System.out.println("Cantidad de menores: "+cantMenores);
System.out.println("Cantidad de mayores: "+cantMayores);
System.out.println("La suma de los menores es: "+sumaMenores);
System.out.println("La suma de los mayores: "+sumaMayores);
    
    
	}
}
