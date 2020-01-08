package pl.robert.videoapp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.robert.videoapp.entity.VideoCassette;

@Repository
public interface VideoCasseteRepo extends CrudRepository<VideoCassette, Long> {



}
