package com.example.msinfo.restcontroller;

import com.example.msinfo.model.Info;
import com.example.msinfo.model.InfoWrapper;
import com.example.msinfo.model.Wine;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Random;

@RestController
@RequestMapping("/info")
public class InfoRestController {
    @GetMapping("/wines")
    public InfoWrapper<Info<Wine>> getWinesDetails(){
        InfoWrapper<Info<Wine>> infoWrapper = InfoWrapper.<Info<Wine>>builder()
                .infoList(Arrays.asList(Info.<Wine>builder()
                        .object(Wine.builder()
                                .id(new Random(100).nextLong())
                                .type("white")
                                .description("from Friuli-Venezia-Giulia")
                                .build())
                        .name("friulano colle duga")
                        .description("perfect with fish dishes")
                        .build()))
                .build();
        return infoWrapper;
    }
    @GetMapping("/wines/{wine_id}")
    public Info<Wine> getWineDetailById(@PathVariable(name = "wine_id") Long id){
        return Info.<Wine>builder().object(Wine.builder().id(id).type("white").description("cheap and good with fish").build()).name("friulano colle duga").description("perfect with fish dishes").build();
    }
}
