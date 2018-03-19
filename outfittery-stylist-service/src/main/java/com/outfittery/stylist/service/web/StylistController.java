package com.outfittery.stylist.service.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.outfittery.stylist.service.api.events.CreateStylistRequest;
import com.outfittery.stylist.service.domain.Stylist;
import com.outfittery.stylist.service.domain.StylistService;

@RestController
@RequestMapping(path = "/stylist")
public class StylistController
{

    @Autowired
    private StylistService stylistService;


    @RequestMapping(method = RequestMethod.POST)
    public CreateStylistResponse create(@RequestBody CreateStylistRequest request)
    {
        Stylist stylist = stylistService.create(request);
        return new CreateStylistResponse(stylist.getId());
    }

}