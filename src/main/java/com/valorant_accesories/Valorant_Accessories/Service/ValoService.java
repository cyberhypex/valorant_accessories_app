package com.valorant_accesories.Valorant_Accessories.Service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@EnableCaching
@Service
public class ValoService {
    private final RestTemplate restTemplate;




    @Value("${valo.agents.url}")  // Use ${} instead of {}
    private String base_url_agents;
    @Value("${valo.buddies.url}")
    private String base_url_buddies;
    @Value("${valo.bundles.url}")
    private String base_url_bundles;
    @Value("${valo.comp.url}")
    private String base_url_compe;
    @Value("${valo.gamemodes.url}")
    private String base_url_gameModes;
    @Value("${valo.maps.url}")
    private String base_url_maps;
    @Value("${valo.weapons.url}")
    private String base_url_weapons;

    public ValoService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Cacheable(value = "agents",key = "#isPlayableCharacter")
    public String getAgents(Boolean isPlayableCharacter) {
        String url = base_url_agents + "&isPlayableCharacter=" + isPlayableCharacter;
        return restTemplate.getForObject(url, String.class);
    }

    @Cacheable(value = "buddies")
    public String getBuddies(){
        String url=base_url_buddies;
        return restTemplate.getForObject(url,String.class);
    }
    @Cacheable(value = "bundles")
    public String getBundles(){
        String url=base_url_bundles;
        return restTemplate.getForObject(url,String.class);
    }
    @Cacheable(value = "comp")
    public String getCompe(){
        String url=base_url_compe;
        return restTemplate.getForObject(url,String.class);
    }
    @Cacheable(value = "gamemodes")
    public String getGameModes(){
        String url=base_url_gameModes;
        return restTemplate.getForObject(url,String.class);
    }
    @Cacheable(value = "maps")
    public String getMaps(){
        String url=base_url_maps;
        return restTemplate.getForObject(url,String.class);
    }
    @Cacheable(value = "weapons")
    public String getWeapons(){
        String url=base_url_weapons;
        return restTemplate.getForObject(url,String.class);
    }

}
