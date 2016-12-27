package kalk;
import static java.lang.Math.*;

/*Napisz prosty kalkulator, w którym zainicjujesz dwie zmienne int a i b dowolnymi liczbami mieszcz¹cymi siê w zakresie - niech a bêdzie liczb¹ ujemn¹, natomiast b dodatni¹... Nastêpnie wykorzystuj¹c import statyczny wyœwietl wyniki nastêpuj¹cych dzia³añ bez u¿ycia dodatkowych zmiennych:
-a^b (a do potêgi b)

-|a| (wartoœæ bezwzglêdna z liczby a)

-pierwiastek z liczby a podniesionej do potêgi b.

Zobacz co siê stanie, gdy do a i b przypiszesz dwie 3 cyfrowe liczby, oraz gdy liczba b bêdzie nieparzysta (wynik a^b bêdzie ujemny).  */

public class kalkulator {

	public static void main(String[] args) {
		
		int a= -15;
		int b= 4;
		
		System.out.println("a^b= "+ pow(a,b));
		System.out.println("|a|= "+ abs(a));
		System.out.println("pierwiastek z a do potegi b = "+ sqrt(pow(a,b)));
		


	

}
}