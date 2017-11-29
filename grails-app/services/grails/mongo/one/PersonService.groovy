package grails.mongo.one

import grails.gorm.transactions.Transactional

@Transactional
class PersonService {

    def savePerson(Person person) {
        person.validate()
        person.save(flush: true)
        return person
    }
}
