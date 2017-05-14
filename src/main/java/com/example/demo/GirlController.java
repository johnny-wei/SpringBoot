package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by vic on 2017/5/14.
 */
@RestController
@RequestMapping(value = "/Girl")
public class GirlController {
    @Autowired
    private GirlResponsity girlResponsity;
    //查找所有
    @GetMapping(value = "/values")
    public List<Girl> getGirlList(){

    return girlResponsity.findAll();
    }
    //查找一个
    @GetMapping(value="/getById/{id}")
    public Girl getGirlById(@PathVariable("id") int id){
        return  girlResponsity.findOne(id);
    }
    //新增一个
    @PostMapping(value = "/addonegirl")
    public  Girl addOneGirl(@RequestParam("cupSize") String cupSize,
                            @RequestParam("age") int age){
        Girl girl=new Girl();
        girl.setCupSize(cupSize);
        girl.setAge(age);
      return  girlResponsity.save(girl);
    }
    //修改
    @PutMapping(value = "/update/{id}")
    public Girl updateGirl(@PathVariable("id") int id,
                           @RequestParam("cupSize") String cupSize,
                           @RequestParam("age") int age){
        Girl girl=new Girl();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return  girlResponsity.save(girl);
    }
    //删除
    @DeleteMapping(value = "/deleteById/{id}")
    public void deleteById(@PathVariable("id") int id){
        girlResponsity.delete(id);

    }
}
