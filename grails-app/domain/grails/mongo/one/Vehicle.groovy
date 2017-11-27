package grails.mongo.one

class Vehicle {

    Integer year

    String name
    Make make
    Model model

    static mapWith = "mongo"

    static constraints = {
        year min: 1900
        name maxSize: 255
    }
}
