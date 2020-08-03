package trash;

import com.example.orderforms.dao.friend.Friend;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FriendRepository extends CrudRepository<Friend, Integer> {
    List<Friend> findByUser(String user);
    Friend findFriendById(Integer id);

}