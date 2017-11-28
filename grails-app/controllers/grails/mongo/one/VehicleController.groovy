package grails.mongo.one

import org.springframework.beans.factory.annotation.Autowired

class VehicleController {

    @Autowired
    VehicleService vehicleService


    def index() {
        def vehicles = vehicleService.findAll()
        //println("vehicles: $vehicles")
        return [vehicles: vehicles]
    }
    //def create() { }
}
