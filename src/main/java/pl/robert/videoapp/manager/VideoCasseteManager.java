package pl.robert.videoapp.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.robert.videoapp.dao.VideoCasseteRepo;
import pl.robert.videoapp.entity.VideoCassette;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class VideoCasseteManager {
    @Autowired
    private VideoCasseteRepo videoCasseteRepo;

    public Optional<VideoCassette> findById (Long id){
        return videoCasseteRepo.findById(id);
    }
    public Iterable<VideoCassette> findAll (){
        return videoCasseteRepo.findAll();
    }

    public VideoCassette save (VideoCassette videoCassette){
        return videoCasseteRepo.save(videoCassette);
    }

    public void deleteById (Long id){
        videoCasseteRepo.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB(){
        save(new VideoCassette(1L, "Titanic", LocalDate.of(1995,1,1)));
        save(new VideoCassette(2L, "Pulp fiction", LocalDate.of(1990,2,1)));
    }

}
