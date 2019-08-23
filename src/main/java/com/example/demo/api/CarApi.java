package com.example.demo.api;

import com.example.demo.entity.Car;
import com.example.demo.entity.CarImg;
import com.example.demo.service.CarService;
import com.example.demo.util.Result;
import com.example.demo.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

@RestController
@CrossOrigin(allowCredentials = "true")
@RequestMapping("/api/car")
public class CarApi {

    @Autowired
    CarService carService;

    @Value("${upload}")
    String address;
    String n;
    @RequestMapping("/upload")
    public Result upload(@RequestParam("pic") MultipartFile multipartFile){
        Result result=null;
        String tail=".jpg";
        if(multipartFile.getOriginalFilename()!=null){
            try {
                System.out.println(multipartFile.getOriginalFilename());
                // String name=multipartFile.getOriginalFilename();
                n=UUIDUtil.get8UUID()+tail;
                multipartFile.transferTo(new File(address+n));
                result=new Result("200","上传成功",n);
            }catch (Exception e){
                e.getStackTrace();
                result=new Result("500","上传失败",e.getMessage());
            }
        }else{
            result=new Result("404","没有数据","");
        }
        return result;
    }

    @RequestMapping("/seach")
    public String selectN(){
        return n;
    }

    /**
     * 周俊波
     * 根据汽车id查询所有汽车信息
     * @return
     */
    @RequestMapping("/queryall")
    public Result selectAll(String id){
        Result result=null;
        try{
            List<Car> car=carService.selectAll(id);
            if(car!=null){
                result=new Result("200","查询成功",car);
            }else{
                result=new Result("404","查询失败",null);
            }
        }catch (Exception e){
            result=new Result("500","查询成功",e.getMessage());
        }
        return result;
    }

    /**
     * 周俊波
     * 查询图片
     * @return
     */
    @RequestMapping("/queryimg")
    public Result selectImg(){
        Result result=null;
        try{
            List<CarImg> car =carService.CarImg();
            if(car!=null){
                result=new Result("200","查询成功",car);
            }else{
                result=new Result("404","查询失败",null);
            }
        }catch (Exception e){
            result=new Result("500","查询成功",e.getMessage());
        }
        return result;
    }
}
