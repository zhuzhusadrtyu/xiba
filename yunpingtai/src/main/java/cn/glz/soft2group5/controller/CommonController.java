package cn.glz.soft2group5.controller;

import cn.glz.soft2group5.pojo.Album;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;
@RestController
public class CommonController {
    @RequestMapping(value = "/albums")
    public List<Album> findAllAlbums(){
        List<Album> albums=new ArrayList<>();
        for(int i=0; i<6;i++){
            Album a=new Album();
            a.setId(i);
            a.setName("album"+i);
            albums.add(a);
        }
           return albums;
    }
}
