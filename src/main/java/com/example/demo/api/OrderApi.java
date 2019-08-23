package com.example.demo.api;

import com.example.demo.entity.Order;
import com.example.demo.service.OrderService;
import com.example.demo.util.Result;
import com.example.demo.vo.OrderVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(allowedHeaders = "true")
@RequestMapping("/api/order")
public class OrderApi {
    @Autowired
    OrderService orderService;
    /**
     * 周俊波
     * 查询已完成订单
     * @return
     */
    @RequestMapping("/queryall")
    public Result queryall(Integer pageNum){
        Result result=null;
        try{
            PageHelper.startPage(pageNum,10);
            List<Order> list=orderService.queryall(pageNum,10);
            PageInfo<Order> pageInfo=new PageInfo<Order>(list);
            Long l=pageInfo.getTotal();
            System.out.println(l);
            OrderVo orderVo=new OrderVo();
            orderVo.setOrderList(list);
            orderVo.setTotal(l);
            if(list!=null){
                result=new Result("200","查询成功",orderVo);
            }else{
                result=new Result("500","查询失败",null);
            }
        }catch (Exception e){
            result=new Result("404","错误",e.getMessage());
        }
        return result;
    }


    /**
     * 周俊波
     * 查询未完成订单
     * @return
     */
    @RequestMapping("/part")
    public Result selectPart(Integer pageNum){
        Result result=null;
        try{
            PageHelper.startPage(pageNum,10);
            List<Order> list=orderService.selectPart(pageNum,10);
            PageInfo<Order> pageInfo=new PageInfo<Order>(list);
            Long l=pageInfo.getTotal();
            System.out.println(l);
            OrderVo orderVo=new OrderVo();
            orderVo.setOrderList(list);
            orderVo.setTotal(l);
            if(list!=null){
                result=new Result("200","查询成功",orderVo);
            }else{
                result=new Result("500","查询失败",null);
            }
        }catch (Exception e){
            result=new Result("404","错误",e.getMessage());
        }
        return result;
    }

    /**
     * 周俊波
     * 多条件根据用户或汽车id查询订单信息
     * @param userId
     * @param carId
     * @return
     */
    @RequestMapping("/queryByid")
    public Result queryByid(String userId,String carId,Integer pageNum){
        Result result=null;
        try{
            PageHelper.startPage(pageNum,10);
            List<Order> list=orderService.queryById(userId,carId,pageNum,10);
            PageInfo<Order> pageInfo=new PageInfo<Order>(list);
            Long l=pageInfo.getTotal();
            System.out.println(l);
            OrderVo orderVo=new OrderVo();
            orderVo.setOrderList(list);
            orderVo.setTotal(l);
            if(list!=null){
                result=new Result("200","查询成功",orderVo);
            }else{
                result=new Result("500","查询失败",null);
            }
        }catch (Exception e){
            result=new Result("404","错误",e.getMessage());
        }
        return result;
    }
}
