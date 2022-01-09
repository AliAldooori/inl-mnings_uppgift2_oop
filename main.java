package inlamnings_uppgift_2_AliAldoori;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Varor v1 = new Varor(1, "tomato", 25);
		Varor v2 = new Varor(2, "bröd", 10);
		Varor v3 = new Varor(3, "mjölk", 15);
		Varor v4 = new Varor(4, "smör", 20);
		Varor v5 = new Varor(5, "apple", 30);
		ArrayList<Varor> butikvarulist = new ArrayList<Varor>(Arrays.asList(v1, v2, v3, v4, v5));
		print(butikvarulist);
		ArrayList<Varor> kundvarolist = new ArrayList<>();
		kundvarolist.add(v1);
		kundvarolist.add(v2);
		kundvarolist.add(v3);
		kundvarolist.add(v4);
		kundvarolist.add(v5);

		Varukorg vk1 = new Varukorg(0, 0, kundvarolist);
		System.out.println(vk1.toString());
		Kund k1 = new Kund("anas", "Sollentuna ", 707604085, vk1);
		System.out.println(k1.toString());
		k1.kvito(kundvarolist);
		ArrayList<Varor> kund1_varualist = k1.KundHandlar(butikvarulist, input);
		print(kund1_varualist);
		k1.kvito(kund1_varualist);

		System.out.println("======================sorterat by name=======================");
		Collections.sort(kund1_varualist, new name());
		print(kund1_varualist);
		System.out.println("======================sorterat by pris=======================");
		Collections.sort(kund1_varualist, new pris());
		print(kund1_varualist);
		System.out.println("======================sorterat by moms=======================");
		Collections.sort(kund1_varualist, new moms_sats());
		print(kund1_varualist);
	}

	public static void print(ArrayList<Varor> a) {

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}

	}
}
