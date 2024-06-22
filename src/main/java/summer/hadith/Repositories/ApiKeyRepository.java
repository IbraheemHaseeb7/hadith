package summer.hadith.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import summer.hadith.Models.ApiKeyModel;

public interface ApiKeyRepository extends JpaRepository<ApiKeyModel, String> {

}
