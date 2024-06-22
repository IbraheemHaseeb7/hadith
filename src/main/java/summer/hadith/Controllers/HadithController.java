package summer.hadith.Controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import summer.hadith.Models.HadithModel;
import summer.hadith.Services.ApiKeyService;
import summer.hadith.Services.HadithService;

@RestController
@RequestMapping("/hadith")
public class HadithController {

    private final HadithService hadithService;
    private final ApiKeyService apiKeyService;

    public HadithController(HadithService hadithService, ApiKeyService apiKeyService) {
        this.hadithService = hadithService;
        this.apiKeyService = apiKeyService;
    }

    @GetMapping("/")
    public List<HadithModel> getHadiths() {
        return hadithService.findAll();
    }

    @GetMapping("/{keyword}")
    public ResponseEntity<List<HadithModel>> getHadithsByKeyword(
            @PathVariable(value = "keyword", required = true) String keyword,
            @RequestHeader(value = "x-api-key", required = false) String apiKey) {
        if (apiKeyService.getApiKey(apiKey).isPresent()) {
            return ResponseEntity.status(200).body(hadithService.findByKeyword(keyword));
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
        }

    }
}
