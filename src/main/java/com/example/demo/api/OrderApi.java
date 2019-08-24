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

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(allowedHeaders = "true")
@RequestMapping("/api/order")
public class OrderApi {
    @Autowired
    OrderService orderService;
    /**
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
            long l=pageInfo.getTotal();
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
            long l=pageInfo.getTotal();
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
     * 多条件根据用户或汽车id查询订单信息
     * @param userName
     * @param carName
     * @return
     */
    @RequestMapping("/queryByid")
    public Result queryByid(String userName,String carName,Integer pageNum){
        Result result=null;
        OrderVo orderVo=new OrderVo();
        try{
            PageHelper.startPage(pageNum,10);
            List<Order> list=orderService.queryById(userName,carName,pageNum,10);
            PageInfo<Order> pageInfo=new PageInfo<Order>(list);
            long l=pageInfo.getTotal();
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
     * 根据当前时间判断是否取车，返回未取车的订单详情
     */
    @RequestMapping("/queryByTime")
    public Result queryByTime(){
        Result result=null;
        Calendar c=Calendar.getInstance();
        List<Order> l1=new ArrayList<Order>();
        List<Order> list=orderService.queryByTime();
        long time;
        try{
            for(int i=0;i<list.size();i++){
               c.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(list.get(i).getGet_time()));
                time=c.getTimeInMillis();
                if((new Date().getTime())<time){
                    l1.add(list.get(i));
                }
            }
            if(list!=null){
                result=new Result("200","查询成功",l1);
            }else{
                result=new Result("500","查询失败",null);
            }
        }catch (Exception e){
            result=new Result("404","错误",e.getMessage());
        }
        return result;
    }
}
