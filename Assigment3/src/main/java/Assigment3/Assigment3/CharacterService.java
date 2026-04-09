package Assigment3.Assigment3;

import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class CharacterService {

	private final CharacterRepository characterRepository;

	public CharacterService(CharacterRepository characterRepository) {
		this.characterRepository = characterRepository;
	}

	public List<Characters> getAllCharacters() {
		return characterRepository.findAll();
	}

	public Characters getCharacterById(Long characterId) {
		return characterRepository.findById(characterId).orElse(null);
	}

	public Characters createCharacter(Characters character) {
		character.setId(null);
		return characterRepository.save(character);
	}

	public Characters updateCharacter(Long characterId, Characters updatedCharacter) {
		Characters existingCharacter = getCharacterById(characterId);
		if (existingCharacter == null) {
			return null;
		}

		existingCharacter.setName(updatedCharacter.getName());
		existingCharacter.setRole(updatedCharacter.getRole());
		existingCharacter.setAge(updatedCharacter.getAge());
		existingCharacter.setUniverse(updatedCharacter.getUniverse());
		existingCharacter.setSpecies(updatedCharacter.getSpecies());
		existingCharacter.setActiveDate(updatedCharacter.getActiveDate());
		return characterRepository.save(existingCharacter);
	}

	public boolean deleteCharacter(Long characterId) {
		if (!characterRepository.existsById(characterId)) {
			return false;
		}
		characterRepository.deleteById(characterId);
		return true;
	}

	public List<Characters> getCharactersByUniverse(String universe) {
		return characterRepository.findByUniverseIgnoreCase(universe);
	}

	public List<Characters> getCharactersBySpecies(String species) {
		return characterRepository.findBySpeciesIgnoreCase(species);
	}

	public List<Characters> searchCharactersByName(String namePart) {
		return characterRepository.findByName(namePart);
	}
}