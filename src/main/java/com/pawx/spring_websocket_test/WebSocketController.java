package com.pawx.spring_websocket_test;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class WebSocketController {
//    @MessageMapping("/add" )
//    @SendTo("/topic/showResult")
//    public Result addNum(CalcInput input) throws Exception {
//        Thread.sleep(2000);
//        Result result = new Result(input.getNum1()+"+"+input.getNum2()+"="+(input.getNum1()+input.getNum2())); 
//        return result;
//    }
    
    
    @MessageMapping("/add" )
    @SendTo("/queue/showResult")
    public Result testQueue(CalcInput input) throws Exception {
        Thread.sleep(2000);
        Result result = new Result(input.getNum1()+"+"+input.getNum2()+"="+(input.getNum1()+input.getNum2())); 
        return result;
    }
} 