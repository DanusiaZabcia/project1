package kalk;
import static java.lang.Math.*;

/*Napisz prosty kalkulator, w kt�rym zainicjujesz dwie zmienne int a i b dowolnymi liczbami mieszcz�cymi si� w zakresie - niech a b�dzie liczb� ujemn�, natomiast b dodatni�... Nast�pnie wykorzystuj�c import statyczny wy�wietl wyniki nast�puj�cych dzia�a� bez u�ycia dodatkowych zmiennych:
-a^b (a do pot�gi b)

-|a| (warto�� bezwzgl�dna z liczby a)

-pierwiastek z liczby a podniesionej do pot�gi b.

Zobacz co si� stanie, gdy do a i b przypiszesz dwie 3 cyfrowe liczby, oraz gdy liczba b b�dzie nieparzysta (wynik a^b b�dzie ujemny).  */

public class kalkulator {

	public static void main(String[] args) {
		
		int a= -15;
		int b= 4;
		
		System.out.println("a^b= "+ pow(a,b));
		System.out.println("|a|= "+ abs(a));
		System.out.println("pierwiastek z a do potegi b = "+ sqrt(pow(a,b)));
		


	

}
}