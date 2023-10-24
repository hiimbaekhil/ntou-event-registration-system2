package ntou.cse.ntoueventregistration.repository;

import ntou.cse.ntoueventregistration.entity.Event;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends MongoRepository<Event, String> {
    List<Event> findByTitleLike(String keyword);
}
