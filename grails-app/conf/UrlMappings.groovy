class UrlMappings {

    // http://grails.org/doc/latest/guide/single.html#urlmappings
	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/"(view:"/index")
		"500"(view:'/error')

        // REST
        "/rest/author/$id"(controller: "author") {
            action = [GET: "rest"]
        }
	}
}
