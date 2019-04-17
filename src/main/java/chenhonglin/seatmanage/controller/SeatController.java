package chenhonglin.seatmanage.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/seat")
public class SeatController {


    @ResponseBody
    @PostMapping("/unavailable")
    public Map<String,Object> unavailable(String floor){
        System.out.println(floor);
        Map<String, Object> map = new HashMap<>(1);
        List<String> array = new ArrayList<>();
        array.add("1_2");
        array.add("1_1");
        array.add("1_3");
        map.put("array", array);
        return map;
    }
}
