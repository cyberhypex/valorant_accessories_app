package com.valorant_accesories.Valorant_Accessories.Controller;
import com.valorant_accesories.Valorant_Accessories.Service.ValoService;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.*;



@EnableCaching
@RestController
@RequestMapping("/valorant")
public class ValoController {

    @Autowired
    private ValoService valoService;


    @Cacheable(value = "agents")
    @GetMapping("/getAgents/{isPlayable}")
    public String getAgents(@PathVariable Boolean isPlayable){
        System.out.println("Calling from API, no cache done");
        String response=valoService.getAgents(isPlayable);
        return response;
    }

    @Cacheable(value = "buddies")
    @GetMapping("/getBuddies")
    public String getBuddies(){
        System.out.println("Calling from API, no cache done");
        String response=valoService.getBuddies();
        return response;
    }
    @Cacheable(value = "bundles")
    @GetMapping("/getBundles")
    public String getBundles(){
        String response= valoService.getBundles();
        return response;
    }

    @Cacheable(value = "comp")
    @GetMapping("/getCompe")
    public String getCompe(){
        String response= valoService.getCompe();
        return response;
    }

    @Cacheable(value = "gamemodes")
    @GetMapping("/getGameModes")
    public String getGameModes(){
        String response= valoService.getGameModes();
        return response;
    }


    @Cacheable(value = "maps")
    @GetMapping("/getMaps")
    public String getMaps(){
        String response=valoService.getMaps();
        return response;
    }

    @Cacheable(value = "weapons")
    @GetMapping("/getWeapons")
    public String getWeapons(){
        String response=valoService.getWeapons();
        return response;
    }


}
