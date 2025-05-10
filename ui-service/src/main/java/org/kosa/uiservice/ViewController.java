package org.kosa.uiservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/orderr")
    public String showOrderPage() {
        return "order"; // resources/templates/order.html
    }
}