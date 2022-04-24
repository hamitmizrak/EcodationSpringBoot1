package com.hamitmizrak.data;

import com.hamitmizrak.entity.ComputerEntity;
import com.hamitmizrak.entity.repository.IComputer;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@Log4j2
public class ComputerData {

    @Autowired
    IComputer iComputer;

    //Save
    // http://localhost:8080/computer/save
    @GetMapping("/computer/save")
    @ResponseBody
    public String saveComputer(){
        UUID uuid=UUID.randomUUID();
        ComputerEntity computer=ComputerEntity
                .builder()
                .computerId(0L)
                .computerName("computerAdi")
                .computerMacId("mac-id: "+uuid)
                .computerPrice(1500)
                .build();
        iComputer.save(computer);
        log.info(computer);
        return "computer Kaydedildi";
    }
}
