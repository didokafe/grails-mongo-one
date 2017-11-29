package grails.mongo.one

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/person")
class PersonController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    @Autowired
    PersonService personService


    @GetMapping
    List<Person> getPersons() {
        return Person.findAll()
    }

    @PostMapping
    void savePerson(@RequestBody Person person) {
        personService.savePerson(person)
    }
}
