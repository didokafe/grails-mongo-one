package grails.mongo.one

import grails.gorm.transactions.Transactional

@Transactional
class VehicleService {

    def findAll() {
        return Vehicle.findAll()
    }
}
