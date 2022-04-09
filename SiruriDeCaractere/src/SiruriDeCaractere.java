import java.util.LinkedList;
import java.util.Scanner;

public class SiruriDeCaractere {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a;
		boolean flag = true;
		String STOP = " ";
		LinkedList<String> siruri = new LinkedList<String>();
		LinkedList<String> siruri2 = new LinkedList<String>();
		while (flag) {
			System.out.print("Stringul: ");
			a = scan.nextLine();
			if (a.equals(STOP))
				flag = false;
			else {
				siruri.add(a);

				for (String element : siruri) {
					if (!element.equals(a)) {
						siruri2.remove(a);
						siruri2.add(a);
					}
				}
			}

		}

		System.out.println(siruri);
		System.out.println(siruri2);

	}

}
