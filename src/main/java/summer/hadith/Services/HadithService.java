package summer.hadith.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import summer.hadith.Models.HadithModel;
import summer.hadith.Repositories.HadithRespository;

@Service
public class HadithService {

    private final HadithRespository hadithRespository;

    public HadithService(HadithRespository hadithRespository) {
        this.hadithRespository = hadithRespository;
    }

    public List<HadithModel> findAll() {
        return hadithRespository.findAll().subList(0, 20);
    }

    public List<HadithModel> findByKeyword(String keyword) {
        return hadithRespository.findByKeyword(keyword);
    }
}
