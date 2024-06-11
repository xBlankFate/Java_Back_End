package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.charset.CodingErrorAction;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.blank.model.Film;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;



public class filmCtrl {
	
	String FILE_DIR = "src/main/resources/files/";
	
	List<Film> listaFilm = new LinkedList<Film>();
	Queue<Film> queueFilm = new LinkedList<Film>();
	Set<Film> setFilm = new HashSet<Film>();
	Set<Film> filmOrdinati = new TreeSet<Film>();

	public static void main(String[] args) {

		filmCtrl fc = new filmCtrl();
		
		fc.cosaMiDai(fc.listaFilm);
		
		ArrayList<Film> al = new ArrayList<Film>();
		
		fc.cosaMiDai(al);
		fc.cosaMiDai(fc.queueFilm);
		fc.leggiFile(new File(fc.FILE_DIR + "best-movies-2023-rt.json"));
		fc.calcolaEta(LocalDate.of(2024, 12, 25));
		
		List<String> registi = fc
								.listaFilm
								.stream()
								.map(f -> f.getRegista())
								.toList();
		
		fc.scriviFile(new File(fc.FILE_DIR + "registi.txt"), registi);
		fc.listaFilm.forEach(f -> System.out.println(f.getTitolo()));
		
	}

	public void cosaMiDai(Collection<Film> films) {

		System.out.println("mi hai dato " + films.getClass());

	}
	
	public void scriviFile(File f, Collection<String> films) {
		
		try {
			
			PrintWriter output = new PrintWriter(f);
			films.forEach(temp -> output.println(temp));
			output.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void leggiFile(File f) {

		try {

			Scanner s = new Scanner(f);
			Gson gson = new Gson();
			StringBuilder sb = new StringBuilder();

			while (s.hasNextLine()) {

				String string = (String) s.nextLine();
				sb.append(string);

			}

			ArrayList<Film> fromJson = gson.fromJson
					(sb.toString(), new TypeToken<List<Film>>() {
						}.getType());

			for (Film film : fromJson) {
				
				listaFilm.add(film);
				queueFilm.add(film);
				setFilm.add(film);
				filmOrdinati.add(film);
				System.out.println(film.getTitolo());

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void calcolaEta(LocalDate dataStart) {
		
		LocalDate dataOggi = LocalDate.now();
		
		System.out.println("Oggi è il " + dataOggi);
		System.out.println("La data selezionata è " + dataStart);
		
		Period until = dataOggi.until(dataStart);
		
		System.out.println(until.getDays());
		
		long daysBetweens = ChronoUnit.DAYS.between(dataStart, dataOggi);
		
		
		System.out.println(daysBetweens);
		
	}
}
