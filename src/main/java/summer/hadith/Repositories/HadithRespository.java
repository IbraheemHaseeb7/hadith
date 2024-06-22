package summer.hadith.Repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import summer.hadith.Models.HadithModel;

public interface HadithRespository extends JpaRepository<HadithModel, Long> {

    @Query(value = "SELECT * FROM \"hadiths_py\" as \"hp\"\r\n" + //
            "WHERE (\"hp\".\"hadith_id\", \"hp\".\"hadith_no\") IN (\r\n" + //
            "\tSELECT \"hadith_id\", \"hadith_no\" FROM \"keywords_py\" as \"kp\"\r\n" +
            //
            "\tWHERE \"kp\".\"keywords\"=:keyword\r\n" + //
            ")", nativeQuery = true)
    List<HadithModel> findByKeyword(@Param("keyword") String keyword);
}
