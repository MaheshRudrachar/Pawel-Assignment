package com.outfittery.booking.service.web;

import com.outfittery.booking.service.domain.Stylist;

public class GetStylistResponse
{

    private Stylist stylist;


    private GetStylistResponse()
    {

    }


    public Stylist getStylist()
    {
        return stylist;
    }


    public void setStylist(Stylist stylist)
    {
        this.stylist = stylist;
    }


    public GetStylistResponse(Stylist stylist)
    {
        this.stylist = stylist;
    }

}
