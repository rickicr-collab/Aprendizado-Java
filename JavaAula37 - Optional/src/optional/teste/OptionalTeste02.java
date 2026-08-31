package optional.teste;

import optional.domain.Manga;
import optional.repository.MangaRepository;

public class OptionalTeste02 {
	public static void main(String[] args) {
		titulo();
		
		System.out.println(" ---  <<< testando com titulos >>> --- ");
		MangaRepository.findByTitle("Naruto").ifPresent(m -> m.setTitle("Naruto Shippuden"));
		MangaRepository.findByTitle("Naruto Shippuden");
		
		System.out.println(" ---  <<< testando excessão  1º caso >>> --- ");
		//MangaRepository.findById(4).orElseThrow(IllegalArgumentException::new);
		
		System.out.println(" --- <<< testando excessão 2º caso >>> --- ");
		Manga newManga = MangaRepository.findByTitle("Drifters").orElseGet(()->{
			System.out.println("Criando novo Manga...");
			return new Manga(4, "Drifters", 12);
		});
		
		System.out.println(newManga);
		
		
		
		
		
		
	}
	
	public static void titulo() {
		System.out.println("-----------------------------------");
		System.out.println("       <<<   Optional  >>>         ");
		System.out.println("-----------------------------------");
	}

}
