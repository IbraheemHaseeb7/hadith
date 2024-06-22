package summer.hadith.Services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import summer.hadith.Models.ApiKeyModel;
import summer.hadith.Repositories.ApiKeyRepository;

@Service
public class ApiKeyService {

    private final ApiKeyRepository apiKeyRepository;

    public ApiKeyService(ApiKeyRepository apiKeyRepository) {
        this.apiKeyRepository = apiKeyRepository;
    }

    public Optional<ApiKeyModel> getApiKey(String key) {
        return apiKeyRepository.findById(key);
    }
}
