package optional.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import optional.domain.Manga;

public class MangaRepository {
	
	private static List<Manga> mangas = new ArrayList(List.of(new Manga(1, "Boku no hero", 24), new Manga(2, "Naruto", 720), new Manga(3, "One Pierce", 1200)));
	
	
	public static Optional<Manga> findByTitle(String title){
		return findBy(find -> find.getTitle().equals(title));
	}
	
	public static Optional<Manga> findById(Integer id){
		return findBy(find -> find.getId().equals(id));
	}
	
	private static Optional<Manga> findBy(Predicate <Manga> predicate){
		Manga found = null;
		for(Manga manga: mangas) {
			if(predicate.test(manga)) {
				found = manga;
			}
		}
		System.out.println("Manga Encontrado: " + found);
		return Optional.ofNullable(found);
	}

}
