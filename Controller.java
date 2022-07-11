package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.LinkedList;
@RestController
public class Controller {
    @GetMapping("/t/{a}/{b}")
    public LinkedList<Integer> method(@PathVariable int a, @PathVariable int b){
        LinkedList<Integer> list = new LinkedList<>();
        if (a == 0 || b == 0){
            return null;
        }
        int cong = a + b;
        int tru = a - b;
        int nhan = a* b;
        float chia =(float) a / b;
        list.add(cong);
        list.add(tru);
        list.add(nhan);
        list.add((int) chia);
        return list;
    }
}
