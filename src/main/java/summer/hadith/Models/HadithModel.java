package summer.hadith.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hadiths_py")
public class HadithModel {

    @Id
    private Long id;

    private String text_en;
    private String hadith_source;
    private Long chapter_no;
    private String chapter;
    private String chain_index;

    public HadithModel() {
    }

    public HadithModel(Long id, String text_en, String hadith_source, Long chapter_no, String chapter,
            String chain_index) {
        this.id = id;
        this.text_en = text_en;
        this.hadith_source = hadith_source;
        this.chapter_no = chapter_no;
        this.chapter = chapter;
        this.chain_index = chain_index;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText_en() {
        return text_en;
    }

    public void setText_en(String text_en) {
        this.text_en = text_en;
    }

    public String getHadith_source() {
        return hadith_source;
    }

    public void setHadith_source(String hadith_source) {
        this.hadith_source = hadith_source;
    }

    public Long getChapter_no() {
        return chapter_no;
    }

    public void setChapter_no(Long chapter_no) {
        this.chapter_no = chapter_no;
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public String getchain_index() {
        return chain_index;
    }

    public void setchain_index(String chain_index) {
        this.chain_index = chain_index;
    }

}
