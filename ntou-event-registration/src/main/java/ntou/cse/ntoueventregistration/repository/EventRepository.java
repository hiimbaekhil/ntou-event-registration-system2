package ntou.cse.ntoueventregistration.repository;

import ntou.cse.ntoueventregistration.entity.Event;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends MongoRepository<Event, String> {
}
