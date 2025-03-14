package com.valorant_accesories.Valorant_Accessories.Controller;

import com.valorant_accesories.Valorant_Accessories.Service.ValoService;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.*;

@CrossOrigin()


@RestController
@RequestMapping("/valorant")
public class AgentsController {

    @Autowired
    private ValoService valoService;

    @GetMapping("/getAgents/{isPlayable}")
    public String getAgents(@PathVariable Boolean isPlayable){
        String response=valoService.getAgents(isPlayable);
        return response;
    }

    @GetMapping("/getBuddies")
    public String getBuddies(){
        String response=valoService.getBuddies();
        return response;
    }

    @GetMapping("/getBundles")
    public String getBundles(){
        String response= valoService.getBundles();
        return response;
    }

    @GetMapping("/getCompe")
    public String getCompe(){
        String response= valoService.getCompe();
        return response;
    }

    @GetMapping("/getGameModes")
    public String getGameModes(){
        String response= valoService.getGameModes();
        return response;
    }
    @GetMapping("/getMaps")
    public String getMaps(){
        String response=valoService.getMaps();
        return response;
    }

    @GetMapping("/getWeapons")
    public String getWeapons(){
        String response=valoService.getWeapons();
        return response;
    }


}
