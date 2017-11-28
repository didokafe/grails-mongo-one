package grails.mongo.one

class Make {

    String name

    static constraints = {
        name blank: false
    }

    String toString() {
        name
    }
}
