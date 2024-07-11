package stylepatrick.project3.resources;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import stylepatrick.shared.service.MyService;

@RestController
@AllArgsConstructor
public class Project3Api {

    private final MyService myService;

    @GetMapping("/")
    public String home() {
        return myService.message();
    }

}
