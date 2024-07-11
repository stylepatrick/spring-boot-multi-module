package stylepatrick.project.resources;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import stylepatrick.shared.service.MyService;

@RestController
@AllArgsConstructor
public class ProjectApi {

    private final MyService myService;

    @GetMapping("/")
    public String home() {
        return myService.message();
    }

}
