package com.qi.service.impl;

import com.qi.service.TicketService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/11/26.
 */
@Service
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "《大鲨鱼》";
    }

}
