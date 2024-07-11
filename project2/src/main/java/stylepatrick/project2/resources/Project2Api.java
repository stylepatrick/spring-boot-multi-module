package stylepatrick.project2.resources;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import stylepatrick.shared.service.MyService;

@RestController
@AllArgsConstructor
public class Project2Api {

    private final MyService myService;

    @GetMapping("/")
    public String home() {
        return myService.message();
    }

}
