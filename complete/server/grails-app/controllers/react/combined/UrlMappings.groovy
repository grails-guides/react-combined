package react.combined

import grails.util.Environment

class UrlMappings {

    static mappings = {
        delete "/$controller/$id(.$format)?"(action:"delete")
        get "/$controller(.$format)?"(action:"index")
        get "/$controller/$id(.$format)?"(action:"show")
        post "/$controller(.$format)?"(action:"save")
        put "/$controller/$id(.$format)?"(action:"update")
        patch "/$controller/$id(.$format)?"(action:"patch")

        if(Environment.developmentRun) { //<1>
            "/"(controller: 'application', action:'index')
        } else {
            "/"(uri: '/index.html')
        }
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
