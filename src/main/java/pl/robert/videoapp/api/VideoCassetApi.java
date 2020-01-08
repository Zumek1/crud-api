package pl.robert.videoapp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.robert.videoapp.entity.VideoCassette;
import pl.robert.videoapp.manager.VideoCasseteManager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cassets")
public class VideoCassetApi {

    @Autowired
    VideoCasseteManager videoCasseteManager;

    @GetMapping("/all")
    public Iterable<VideoCassette> getAll() {
        return videoCasseteManager.findAll();
    }

    @GetMapping
    public Optional<VideoCassette> getById(@RequestParam Long index) {
        return videoCasseteManager.findById(index);
    }

    @PostMapping
    public VideoCassette addVideo(@RequestBody VideoCassette videoCassette) {
        return videoCasseteManager.save(videoCassette);
    }

    @PutMapping
    public VideoCassette updateVideo(@RequestBody VideoCassette videoCassette) {
        return videoCasseteManager.save(videoCassette);
    }

    @DeleteMapping
    public void deleteVideo(@RequestParam Long index) {
        videoCasseteManager.deleteById(index);
    }
}
