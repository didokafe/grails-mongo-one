package grails.mongo.one

import grails.gorm.annotation.Entity

@Entity
class Person {

    String firstName
    String lastName
    Integer age

    static constraints = {
        firstName blank: false
        lastName blank: false
        age nullable: false
    }
}
