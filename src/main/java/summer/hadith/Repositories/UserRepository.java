package summer.hadith.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import summer.hadith.Models.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {

}
