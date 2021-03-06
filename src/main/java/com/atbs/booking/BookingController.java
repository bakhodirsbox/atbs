package com.atbs.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    private BookingService service;

    @Autowired
    public void setService(BookingService service) {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Booking> getList() {
        return service.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Booking getOne(@PathVariable Long id) {
        return service.findOne(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Long save(@RequestBody BookingItem item) {
        return service.create(item);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Booking update(@PathVariable Long id, @RequestBody BookingItem item) {
        return service.update(id, item);
    }
}
