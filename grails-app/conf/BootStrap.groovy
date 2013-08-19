import grails.converters.JSON
import secret.happiness.Author

class BootStrap {

    // http://manbuildswebsite.com/2010/02/15/rendering-json-in-grails-part-3-customise-your-json-with-object-marshallers/
    def init = { servletContext ->
        JSON.registerObjectMarshaller(Author) {
            def returnArray = [:]
            returnArray['name'] = it.name
            returnArray['url'] = it.website
            return returnArray
        }
    }

    def destroy = {
    }
}
